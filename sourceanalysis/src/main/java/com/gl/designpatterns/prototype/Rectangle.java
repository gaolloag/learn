package com.gl.designpatterns.prototype;

/**
 * @author gaoliang
 */
public class Rectangle extends Shape  {

    public Rectangle() {
        super.type = "Rectangle";
    }


    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}