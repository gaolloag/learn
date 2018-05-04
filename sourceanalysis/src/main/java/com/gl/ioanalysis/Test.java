package com.gl.ioanalysis;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @author gaoliang
 */
public class Test {
    public static void main(String[] args) {
        try {
            InputStream in = new BufferedInputStream(new FileInputStream(new File("")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}