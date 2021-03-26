package com.stydy.thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Timer定时任务
 * @author fengfasong
 * @date 2020/12/18
 */
public class MyTimerTask extends TimerTask {

    private boolean flag;

    private Timer timer;

    private TestTimer testTimer;

    public MyTimerTask(boolean flag,Timer timer,TestTimer testTimer) {
        this.flag = flag;
        this.timer = timer;
        this.testTimer = testTimer;
    }

    @Override
    public void run() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sdf.format(new Date()));
        if(!flag){
            testTimer.test();
            System.out.println("等待时间执行，flag为："+flag+sdf.format(new Date()));
            //timer.cancel();
        }
        else {
            testTimer.test();
            System.out.println("立即执行，flag为："+flag+sdf.format(new Date()));
            flag = false;
            //timer.cancel();
        }
    }
}
