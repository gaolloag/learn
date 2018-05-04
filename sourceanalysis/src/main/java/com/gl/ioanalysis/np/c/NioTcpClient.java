package com.gl.ioanalysis.np.c;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;

/**
 * @author gaoliang
 */
public class NioTcpClient {
    public static void main(String[] args) throws IOException {

        // 打开监听信道并设置为非阻塞模式
        SocketChannel socketChannel = SocketChannel.open(new InetSocketAddress("127.0.0.1", 8080));
        socketChannel.configureBlocking(false);

        // 打开并注册选择器到信道
        Selector selector = Selector.open();
        socketChannel.register(selector, SelectionKey.OP_READ);

        ByteBuffer writeBuffer = ByteBuffer.wrap("abcdefg".getBytes("UTF-16"));

        int r = socketChannel.write(writeBuffer);
        System.out.println("write return:" + r);
    }
}