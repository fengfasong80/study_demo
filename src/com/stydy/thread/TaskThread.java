package com.stydy.thread;

/**
 * 线程任务
 */
public class TaskThread implements Runnable {

    private Integer num;

    public TaskThread(Integer num) {
        this.num = num;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            num = i;
            System.out.println(num);
            try {
                Thread.sleep(2000L);
                //执行改方法的线程，其状态可能由RUNNING转为READY
                Thread.yield();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
