package com.stydy.timer;

import org.junit.Test;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Timer主测试类
 * @author fengfasong
 * @date 2020/11/23
 */
public class MainTestDemo {

    private ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(5);

    @Test
    public void test01(){
        TimerTask01 task01 = new TimerTask01();
        executorService.schedule(task01,2,TimeUnit.SECONDS);
    }
}
