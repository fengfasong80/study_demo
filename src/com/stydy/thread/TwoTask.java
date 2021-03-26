package com.stydy.thread;

import java.util.Timer;
import java.util.TimerTask;

public class TwoTask extends TimerTask {

    private Timer timer;

    public TwoTask(Timer timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        System.out.println("============第二个Timer========");
        timer.cancel();
    }
}
