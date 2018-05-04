package com.gl.datastruct.binarytree;

/**
 * @author gaoliang
 */
public class BinaryTree {
    private Node root = null;

    public BinaryTree(int value){
        root = new Node(value);

        root.leftChild = null;
        root.rightChild = null;
    }

    /**
     * 二叉数查找
     * */
    public Node findKey(int value){

        Node current = root;
        while(true){
          if(value == current.value){
              return current;
          } else if(value < current.value){
              current = current.leftChild;
          } else if(value > current.value){
              current = current.rightChild;
          }

          if(current == null){
              return null;
          }
        }

    }

    /**
     * 插入
     * */
    public String insert(int value){
        String error = null;
        Node node = new Node(value);
        if(root == null){
            root = node;
            root.leftChild = null;
            root.rightChild = null;
        }else{
            Node current = root;
            Node parent = null;
            while (true){

                if(value < current.value){
                    parent = current;
                    current = current.leftChild;
                    if(current == null){
                        parent.leftChild = node;
                        break;
                    }
                }else if(value > current.value){
                    parent = current;
                    current = current.rightChild;
                    if(current == null){
                        parent.rightChild = node;
                        break;
                    }
                }else{
                    error = "having same value in binary tree";
                }

            }
        }
        return error;
    }

    /**
     * 中序遍历
     * */
    public void inOrderTraverse(){

        inOrderTraverse(root);
        System.out.println();
    }

    private void inOrderTraverse(Node node){
        if(node == null){
            return ;
        }

        inOrderTraverse(node.leftChild);
        node.display();
        inOrderTraverse(node.rightChild);
    }

    /**
     * 删除节点
     * */
    public boolean delete(int value){
        Node current = root;
        Node parent = null;
        boolean isLeftChild = true;

        while(true){
            if(value == current.value){
                break;
            }else if(value < current.value){
                isLeftChild = true;
                parent = current;
                current = current.leftChild;
            }else {
                isLeftChild = false;
                parent = current;
                current = current.rightChild;
            }

            if(current == null){
                return false;
            }

        }

        //1.叶子节点
        if(current.leftChild == null && current.rightChild == null){
            if(current == root){
                root = null;
            }else{
                if(isLeftChild){
                    parent.leftChild = null;
                }else{
                    parent.rightChild = null;
                }
            }

        }
        //2.删除节点有单节点
        else if(current.rightChild == null){
            //2.1.删除节点为左子节点
            if(current == root){
                root = current.leftChild;
            }else{
                if(isLeftChild){
                    parent.leftChild = current.leftChild;
                }else {
                   parent.rightChild = current.leftChild;
                }
            }

        }else if(current.leftChild == null){
            //2.2删除节点为右子节点
        }
        //3.删除的节点有两个子节点
        else{

        }



        return true;
    }



    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(50);
        binaryTree.insert(40);
        binaryTree.insert(30);
        binaryTree.insert(60);
        binaryTree.delete(30);
        //binaryTree.inOrderTraverse();
    }
}