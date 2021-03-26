package com.stydy.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Timer;

/**
 * timer启动类
 * @author fengfasong
 * @date 2020/12/18
 */
public class TimerStart {

    private Timer timer = new Timer();



    public void test() throws ParseException {
        TestTimer testTimer = new TestTimer();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse("2021-01-07 09:00:00");
        String s = retDateTime("09:00:00", "1");
        Date parse1 = sdf.parse(s);
        Date nowDate = new Date();
        boolean flag = parse1.before(nowDate);
        System.out.println(flag);
        MyTimerTask timerTask = new MyTimerTask(flag,timer,testTimer);
        System.out.println(sdf.format(parse));
        System.out.println(parse.getTime());
        timer.schedule(timerTask,parse1,1*60*1000L);
    }


    public static void main(String[] args) throws ParseException {
        TimerStart timerStart = new TimerStart();
        timerStart.test();
    }

    public String retDateTime(String time,String pollTime){
        //定义时间格式
        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //将今天的日期拼接上每天的定时时间
        String dateTime = dtfDate.format(LocalDate.now())+" "+time;
        //将字符转换为时间
        LocalDateTime timing = LocalDateTime.parse(dateTime, dtfTime);
        //获取定时时间的毫秒数
        Long timingMilli = timing.atZone(ZoneId.of("+8")).toInstant().toEpochMilli();
        //获取间隔时间的毫秒数（分钟为单位）
        Long pollMilli = Integer.parseInt(pollTime) * 60 * 1000L;
        //获取当前时间的毫秒数
        long nowTimeMilli = LocalDateTime.now().atZone(ZoneId.of("+8")).toInstant().toEpochMilli();
        //当前时间在今天的轮发轮次
        double times = (double)(nowTimeMilli - timingMilli) / (double) pollMilli;
        //对轮发轮次进行向上取整，得到轮发轮次，并使用等差数列的性质得到该轮次的时间毫秒数
        Long endMilli = timingMilli + (int)Math.ceil(times) * pollMilli;
        //获取当前毫秒数的时间
        Date endDate = new Date();
        endDate.setTime(endMilli);
        return sdf.format(endDate);
    }
}
