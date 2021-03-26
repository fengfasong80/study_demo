package com.stydy.codegym;

public class Solution01 {
    public static void main(String[] args) {
        // 创建 10 个 Cat 对象
        Cat cat;
        for (int i = 0; i < 10; i++) {
            cat = new Cat();
        }
        // 显示变量 catCount 的值
        System.out.println(Cat.catCount);
    }

    public static class Cat {
        // 创建 static 变量 catCount
        public static int catCount;

        // 声明构造方法

        public Cat() {
            catCount = Cat.catCount+1;
        }
    }
}
