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
public class FileStudy07 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/filetest/test.txt");
        FileWriter fileWriter = null;
        PrintWriter printWriter = null;
        try {
            fileWriter = new FileWriter(file);
            printWriter = new PrintWriter(fileWriter);

            printWriter.println("hello world!");
            printWriter.println("不看源码的程序员！");
            printWriter.write("hello world！");
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(fileWriter != null){
                fileWriter.close();
            }
            if(printWriter != null){
                printWriter.close();
            }
        }
    }
}
