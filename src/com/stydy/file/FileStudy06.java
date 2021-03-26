package com.stydy.file;

import java.io.*;

/**
 * 缓存流读取数据
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy06 {
    /**
     * BufferedReader：使用缓存流读取数据
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        File file = new File("F:/filetest/test.txt");
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;

        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            while (true){
                String line = bufferedReader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fileReader != null){
                fileReader.close();
            }
            if(bufferedReader != null){
                bufferedReader.close();
            }
        }

    }
}
