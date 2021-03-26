package com.stydy.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 文件操作
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy01 {
    /**
     * 文件输入流，即读取文件
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("F:/filetest/test.txt");
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] all = new byte[(int)file.length()];
        fileInputStream.read(all);
        for(byte b : all){
            System.out.println(b);
        }
        fileInputStream.close();
        System.out.println(file.getAbsolutePath());
    }
}
