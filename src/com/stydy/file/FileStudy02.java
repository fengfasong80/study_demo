package com.stydy.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件流
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy02 {
    /**
     * 文件输出流，即写文件
     * @param args
     */
    public static void main(String[] args) {
        File file = new File("F:/filetest/test.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] data = {88,89};
            fileOutputStream.write(data);
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
