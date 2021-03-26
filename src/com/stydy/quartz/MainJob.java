package com.stydy.quartz;

import org.junit.Test;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainJob {

    @Test
    public void test() throws SchedulerException {

    }

    public static void main(String[] args) {
        try {
            String strTime = "2021-02-27 15:30:00";
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            JobDetail job = JobBuilder.newJob(HelloJob.class).withIdentity("job41", "group1").build();
            //定义一个触发器 简单Trigger 设置工作名称与组名 5秒触发一次
            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startAt(getDateByStr(strTime))
                    .withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(5).withRepeatCount(5))
                    .build();
            scheduler.scheduleJob(job, trigger);
            scheduler.start();
        }catch (Exception e){

        }
    }

    /**
     * 根据字符时间返回Date时间
     * @param date
     * @return
     */
    public static Date getDateByStr(String date){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = new Date();
        try {
            parse = sdf.parse(date);
        }catch (Exception e){
            e.printStackTrace();
        }
        return parse;
    }
}
