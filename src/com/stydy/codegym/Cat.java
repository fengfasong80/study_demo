package com.stydy.codegym;

import java.util.ArrayList;

public class Cat {

    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

    }

    public static void main(String[] args) {
        //在此编写你的代码
        for (int i = 0; i < 10; i++) {
            Cat cat = new Cat();
            Cat.cats.add(cat);
        }
        printCats();
    }

    public static void printCats() {
        //在此编写你的代码
        for (Cat item : Cat.cats){
            System.out.println(item);
        }
    }
}
