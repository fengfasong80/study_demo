package com.stydy.file;

import java.io.*;

/**
 * 文件操作
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy04 {
    /**
     * 写文件
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("F:/filetest/test.txt");
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(file);
            String str = "不会看源码的程序员，\n不是好程序员！";
            char[] data = str.toCharArray();
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter != null){
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
