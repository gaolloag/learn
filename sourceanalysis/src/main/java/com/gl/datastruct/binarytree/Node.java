package com.gl.datastruct.binarytree;

/**
 * @author gaoliang
 */
public class Node {
    protected int value;
    protected Node leftChild;
    protected Node rightChild;

    public Node(int v){
        this.value = v;
    }

    public void display(){
        System.out.print(this.value  + "\t");
    }

    @Override
    public String toString(){
        return String.valueOf(this.value);
    }
}