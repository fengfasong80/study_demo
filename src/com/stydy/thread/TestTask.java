package com.stydy.thread;

import java.time.LocalDateTime;

public class TestTask implements Runnable {
    @Override
    public void run() {
        System.out.println(LocalDateTime.now());
        System.out.println("线程测试");
    }
}
