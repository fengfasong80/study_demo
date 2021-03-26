package com.stydy.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 文件操作
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy08 {
    /**
     * 强制进行缓存数据的操作，不管缓存是否已满
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("F:/filetest/test.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;

        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);

            printWriter.println("JAVA是世界上最好的语言！");
            //强制存储，不管缓存是否已满
            printWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileWriter != null){
                fileWriter.close();
            }
            if(printWriter != null){
                printWriter.close();
            }
        }
    }
}
