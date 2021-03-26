package com.stydy.thread;

import java.util.concurrent.ThreadFactory;

public class TtttThr implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        return thread;
    }
}
