package com.stydy.thread;

import java.util.Arrays;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.locks.LockSupport;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * 主线程
 * @author fengfasong
 * @date 2020/12/17
 */
public class MainThread {

    public static void main(String[] args) {
        ScheduledThreadPoolExecutor t = new ScheduledThreadPoolExecutor(4);
        int num = 0;
        IntStream stream = Arrays.stream(new int[]{1, 2, 3});
        stream.boxed().collect(Collectors.toList());
        TaskThread task01 = new TaskThread(num);
        TaskThread task02 = new TaskThread(num);

        Thread thread01 = new Thread(task01);
        Thread thread02 = new Thread(task02);


        thread01.start();
        thread02.start();

        /**
         * 使正在执行的线程变为WAITING状态的办法
         */
        try {
            task01.wait();
            thread01.join();
            LockSupport.park(task01);
        }catch (Exception e){

        }
        /**
         * 使线程从WAITING状态变为RUNNABLE状态
         */
        try {
            task01.notify();task01.notifyAll();
            LockSupport.unpark(thread01);

        }catch (Exception e){

        }

    }
}
