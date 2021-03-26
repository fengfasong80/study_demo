package com.stydy.file;

import java.io.*;

/**
 * 文件操作
 * @author fengfasong
 * @date 2020/9/22
 */
public class FileStudy10 {
    /**
     * 对象流
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setHp(100);

        File file = new File("F:/filetest/garen.lol");
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;

        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;

        try {
            fileOutputStream = new FileOutputStream(file);
            objectOutputStream = new ObjectOutputStream(fileOutputStream);

            fileInputStream = new FileInputStream(file);
            objectInputStream = new ObjectInputStream(fileInputStream);
            objectOutputStream.writeObject(hero);
            Hero o = (Hero) objectInputStream.readObject();
            System.out.println(o.getHp());
            System.out.println(o.getName());


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }
            if(fileOutputStream != null){
                fileOutputStream.close();
            }
            if(objectInputStream != null){
                objectInputStream.close();
            }
            if(objectOutputStream != null){
                objectOutputStream.close();
            }
        }

    }
}
