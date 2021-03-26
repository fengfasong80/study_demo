package com.stydy.file;

import java.io.*;

/**
 * 文件操作
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy09 {
    public static void main(String[] args) throws IOException {
        File file = new File("F:/filetest/test.txt");
        FileInputStream fileInputStream = null;
        DataInputStream dataInputStream = null;
        try {
            write(file);
            fileInputStream = new FileInputStream(file);
            dataInputStream = new DataInputStream(fileInputStream);
            String s = dataInputStream.readUTF();
            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }
            if (dataInputStream != null) {
                dataInputStream.close();
            }
        }
    }

    public static void write(File file) throws IOException {
        FileOutputStream fileOutputStream = null;
        DataOutputStream dataOutputStream = null;
        if(file != null){
            try {
                fileOutputStream = new FileOutputStream(file);
                dataOutputStream = new DataOutputStream(fileOutputStream);

                dataOutputStream.writeUTF("不看源码的程序员");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
                if(dataOutputStream != null){
                    dataOutputStream.close();
                }
            }
        }
    }
}
