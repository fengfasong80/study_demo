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
public class FileStudy05 {
    public static void main(String[] args) {
        File file = new File("F:/filetest/test.txt");
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream(file);
            byte[] all = new byte[(int)file.length()];
            fileInputStream.read(all);
            for(byte b : all){
                int i = b&0x000000ff;
                System.out.println(Integer.toHexString(i));
            }
            String str = new String(all,"UTF-8");
            System.out.println(str);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
