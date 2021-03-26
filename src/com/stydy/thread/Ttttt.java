package com.stydy.thread;


import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Ttttt {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = new ScheduledThreadPoolExecutor(4,new TtttThr());
        TestTask testTask = new TestTask();
        scheduledExecutorService.scheduleWithFixedDelay(testTask,2000L,2000L,TimeUnit.MILLISECONDS);

    }
}
