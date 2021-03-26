package com.stydy.common;

/**
 *
 */
public class PrintNum implements TestIn<Integer>{

    private Integer num;

    public PrintNum(Integer num) {
        this.num = num;
    }

    @Override
    public void print(Integer param) {
        System.out.println(param);
    }

    @Override
    public void print() {
        System.out.println(num);
    }

}
