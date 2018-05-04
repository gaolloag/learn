package com.gl.ioanalysis.np.s;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.Iterator;

/**
 * @author gaoliang
 *
 * Reactor模式
 */
public class Nio {
    // 缓冲区大小
    private static final int BUFFER_SIZE = 1024;
    
    public static void main(String[] args) throws IOException {
        // 开启一个ServerSocketChannel，在8080端口上监听
        ServerSocketChannel server = ServerSocketChannel.open();
        server.bind(new InetSocketAddress("0.0.0.0", 8080));
        // 创建一个多路复用器 (Selector 多路复用器)
        Selector selector = Selector.open();

        // 创建一个处理协议的实现类,由它来具体操作
        TCPProtocol protocol = new TCPProtocolImpl(BUFFER_SIZE);

        // 必须设置通道为 非阻塞，才能向Selector注册。否则报 IllegalBlockingModeException
        server.configureBlocking(false);
        // 将ServerSocketChannel注册到多路复用器上，并声明关注其ACCEPT就绪事件
        server.register(selector, SelectionKey.OP_ACCEPT);

        while(selector.select() !=0) {
            // 遍历所有就绪的Channel关联的SelectionKey
            Iterator<SelectionKey> iterator = selector.selectedKeys().iterator();
            while (iterator.hasNext()) {
                SelectionKey key = iterator.next();

                // 如果这个Channel是READ就绪
                if (key.isReadable()) {
                    // 读取该Channel
                    //((SocketChannel) key.channel()).read(ByteBuffer.allocate(10));
                    System.out.println("readable");
                    protocol.handleRead(key);
                }

                if (key.isWritable()) {
                    //... ...
                }

                // 如果这个Channel是ACCEPT就绪
                if (key.isAcceptable()) {
                    // 接收新的客户端连接
                    SocketChannel accept = ((ServerSocketChannel) key.channel()).accept();
                    accept.configureBlocking(false);
                    // 将新的Channel注册到多路复用器上，并声明关注其READ/WRITE就绪事件

                    accept.register(key.selector(), SelectionKey.OP_READ | SelectionKey.OP_WRITE,ByteBuffer.allocate(1024));
                }

                // 删除已经处理过的SelectionKey
                iterator.remove();
            }
        }

    }
}