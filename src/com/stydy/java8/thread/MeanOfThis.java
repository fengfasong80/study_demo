package com.stydy.java8.thread;

/**
 * 多线程this关键字
 * @author fengfasong
 * @date 2020/10/9
 */
public class MeanOfThis {
    public final int value = 4;

    public void doIt(){
        final int value = 6;
        Runnable runnable = new Runnable() {
            public final int value = 5;
            @Override
            public void run() {
                System.out.println(this.value);
            }
        };
        runnable.run();
    }

    public static void main(String[] args) {
        MeanOfThis meanOfThis = new MeanOfThis();
        meanOfThis.doIt();
    }
}
