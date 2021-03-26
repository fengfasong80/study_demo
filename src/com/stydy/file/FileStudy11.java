package com.stydy.file;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 文件操作（流操作）
 * @author fengfasong
 * @date 2020/9/23
 */
public class FileStudy11 {
    /**
     * 流操作，从键盘进行输入
     * @param
     */
    public static void main(String[] args) throws IOException {
        /**
         * BufferedReader
         */
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            System.out.println(bufferedReader.readLine());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            if(bufferedReader != null){
//                bufferedReader.close();
//            }
//        }

        /**
         * InputStream
         */
      //  InputStream inputStream = System.in;
      //  System.out.println(inputStream.read());

        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
