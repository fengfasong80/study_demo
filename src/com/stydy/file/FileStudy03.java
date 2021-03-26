package com.stydy.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * 文件操作
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy03 {
    public static void main(String[] args) {
        /**
         * 文件读取
         */
        File file = new File("F:/filetest/test.txt");
        try {
            FileReader fileReader = new FileReader(file);
            char[] all = new char[(int)file.length()];
            fileReader.read(all);
            for(char c : all){
                System.out.println(c);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
