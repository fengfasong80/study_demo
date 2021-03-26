package com.stydy.date;


import org.junit.Test;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.util.Date;
import java.util.List;

/**
 * 时间工具类
 * @author fengfasong
 * @date 2020/8/1
 */
public class DateUtils {

    /**
     * 当前日期转换为字符串
     */
    @Test
    public void test01() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = sdf.parse("20201011");
        String nowTime = sdf.format(new Date());
        System.out.println(sdf2.format(parse));
    }

    /**
     * 将字符串日期转换为date
     */
    @Test
    public void test02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss");
        Date date = sdf.parse("12:12:16");
        System.out.println(date);
    }

    /**
     * JDK8新特性之时间类（推荐使用）
     * LocalDate
     */
    @Test
    public void test03(){
        /**
         * 获取当前日期（默认时区）
         */
        LocalDate localDate = LocalDate.now();

        System.out.println("当前日期："+localDate);
        /**
         * 年份获取
         * ChronoField:这在JDK中是一个枚举
         */
        int cYear = localDate.getYear();
        int nYear = localDate.get(ChronoField.YEAR);
        System.out.println("国际年份"+cYear+" 数字年份："+nYear);
        /**
         * 月份获取
         */
        Month cMonth = localDate.getMonth();
        int nMonth = localDate.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("国际月份："+cMonth+" 数字月份"+nMonth);
        /**
         * 号数获取
         */
        int cDay = localDate.getDayOfMonth();
        int nDay = localDate.get(ChronoField.DAY_OF_MONTH);
        System.out.println("国际号数："+cDay+" 数字号数:"+nDay);
        /**
         * 星期获取
         */
        DayOfWeek cWeek = localDate.getDayOfWeek();
        int nWeek = localDate.get(ChronoField.DAY_OF_WEEK);
        System.out.println("国际周："+cWeek+" 数字周:"+nWeek);
    }

    /**
     * 使用LocalDate设置指定日期
     */
    @Test
    public void test04(){
        /**
         * 指定日期
         */
        LocalDate appointDate = LocalDate.of(2020,7,1);
        System.out.println(appointDate);
        /**
         * 获取巴基斯坦当前时间（指定时区）
         */
        LocalDate bjstLocalDate = LocalDate.now(ZoneId.of("+5"));
        System.out.println(bjstLocalDate);
        /**
         * 指定时钟获取日期
         */
        LocalDate localDate = LocalDate.now(Clock.systemUTC());
        System.out.println(localDate);
    }
    /**
     * LocalTime
     */
    @Test
    public void test05(){
        /**
         * 获取当前时间
         * 其余用法同LocalDate
         */
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
    }

    /**
     * LocalDateTime
     */
    @Test
    public void test06(){
        /**
         * 获取当前日期时间
         * 打印结果：2020-08-01T17:26:08.133
         * 关于中间T的解释：
         * @Override
         *     public String toString() {
         *         return date.toString() + 'T' + time.toString();
         *     }
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        /**
         * 设置日期时间
         * 这里只写一种，其他的可自己查看
         */
        LocalDateTime appointTime = LocalDateTime.of(2020,8,1,17,31,20,700);
        System.out.println(appointTime);
    }
    /**
     * LocalDateTime的格式化输出
     */
    @Test
    public void test07(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        String format = dtf.format(LocalDate.now());
        System.out.println(format);
       /* String year = format.substring(0,4);
        String month = format.substring(5,7);
        String day = format.substring(8,10);
        System.out.println("日期:"+format+"年份:"+year+"月份:"+month+"号数："+day);*/
    }

    /**
     * 时间的比较
     */
    @Test
    public void test08(){
        /**
         * 获取当前时间
         */
        LocalDateTime localDateTime = LocalDateTime.now();
        /**
         * 指定一个时间
         */
        LocalDateTime appointTime = LocalDateTime.of(2020,01,01,00,00,00);
        /**
         * 判断当前时间是否在指定时间之后
         * 返回true，说明当前时间在指定时间之后
         */
        System.out.println(localDateTime.isAfter(appointTime));
    }

    /**
     * m时间的比较，采用毫秒数进行获取当前时间的毫秒数比较
     */
    @Test
    public void test09(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime appointTime = LocalDateTime.of(2020,01,01,00,00,00);
        /**
         *
         * 东八区，北京时间
         */
        Long nowTimeMili = localDateTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();
        /**
         * 获取指定时间的毫秒数
         */
        Long appointTimeMili = appointTime.toInstant(ZoneOffset.of("+8")).toEpochMilli();

        System.out.println(nowTimeMili > appointTimeMili);
    }

    @Test
    public void test10() throws ParseException {
        LocalTime parse = LocalTime.parse("15:40:33");
        System.out.println(parse);
    }

    @Test
    public void getDateMili(){
        String startTimr = "15:13:00";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String format = dtf.format(LocalDate.now());
        String initTime = format+" "+startTimr;
        //long initLong = LocalDateTime.parse(initTime).toInstant(ZoneOffset.of("+8")).toEpochMilli();
        LocalDateTime parse = LocalDateTime.parse(initTime,df);
        System.out.println(parse);
    }


    @Test
    public void test11(){
        //LocalDateTime now = LocalDateTime.now();
        System.out.println(400000002 % 200000000);
    }

    @Test
    public void test12() throws ParseException {
        Date result = new Date();
        //当前时间毫秒数
        long nowTime = result.getTime();
        System.out.println(nowTime);
        String startTime = "09:00:00";
        String timeJg = "5";
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String date = dtf.format(LocalDate.now());
        //当前日期拼接上定时时间
        result = sdf.parse(date+" "+startTime);
        //间隔毫秒数
        int mili = Integer.parseInt(timeJg) * 60 * 1000;
        //定时时间毫秒数
        long time = result.getTime();

        double v = Double.parseDouble(String.valueOf(nowTime));
        double v1 = Double.parseDouble(String.valueOf(time));
        double v2 = Double.parseDouble(String.valueOf(mili));

        System.out.println(time);
        System.out.println((v - v1) / v2);
        System.out.println(Math.ceil((v - v1) / v2));
        Double ceil = Math.ceil((v - v1) / v2);
        //获取轮发次数
        int i = ceil.intValue();

        Long endMili = time + i * mili;
        Date endEnd = new Date();
        endEnd.setTime(endMili);
        String format = sdf.format(endEnd);
        System.out.println(time + i * mili);
        System.out.println(format);

    }

    @Test
    public void test13(){
        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate parse = LocalDate.parse("2021-02-05", dtfDate);
        String time = "16:00:00";
        String poll = "5";
        String s = retDateTime(parse,time, poll);
        System.out.println(s);
    }

    /**
     * 获取定时任务中，数据的下一次发送时间（轮发模式）
     * @param time 定时时间
     * @param pollTime 轮发间隔
     * @return
     */
    public String retDateTime(LocalDate khrq,String time,String pollTime){
        //定义时间格式
        DateTimeFormatter dtfDate = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtfTime = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        if(khrq.isAfter(LocalDate.now())){
            return khrq.toString()+" "+time;
        }
        //将今天的日期拼接上每天的定时时间
        //09：00：00   105
        //09：04：00   104
        //09：00：00
        String dateTime = dtfDate.format(LocalDate.now())+" "+time;
        //将字符转换为时间
        LocalDateTime timing = LocalDateTime.parse(dateTime, dtfTime);
        if(timing.isAfter(LocalDateTime.now())){
            return dateTime;
        }
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

    @Test
    public void test99999(){
        BigDecimal money = new BigDecimal("8000000000.00");
        String moneyStr = String.valueOf(money);
        String[] split = moneyStr.split("\\.");
        Long moneyF = Long.parseLong(split[0]) * 100L + Integer.parseInt(split[1]);
        String str = String.valueOf(moneyF);
        System.out.println(str);
    }

    @Test
    public void test44(){
        String format = String.format("%" + 60 + "s", " ");
        System.out.println(format);
        System.out.println(format.length());
    }

    @Test
    public void moneyCount(){
        BigDecimal money = new BigDecimal("343");
        BigDecimal multiply = money.multiply(new BigDecimal("100"));
        String moneyStr = String.valueOf(multiply);
        String[] split = moneyStr.split("\\.");
        System.out.println(split[0]);

    }

    @Test
    public void test99999999() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String time = "09:00:00";
        String format = sdf.format(new Date());
        Date parse = sdf.parse(time);
        boolean before = parse.before(new Date());
        System.out.println(before);

    }

    @Test
    public void retDzsj(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String result = "";


        String jydzsjParam1 = "13:00:00";
        String date = dtf.format(LocalDate.now());
        //对账时间
        //LocalDateTime dzsj = (LocalDateTime) dtf2.parse();
        LocalDateTime dzsj = LocalDateTime.parse(date + " " + jydzsjParam1, dtf2);
        //Date dzsj = sdf.parse(date+" "+jydzsjParam1);
        //当前时间
        LocalDateTime nowDate = LocalDateTime.now();
        boolean before = nowDate.isBefore(dzsj);
        if (before) {
            result = dtf2.format(dzsj);
        } else {
            result = dtf2.format(dzsj.plusDays(1L));
        }
        System.out.println(result);
    }

    @Test
    public void test555(){
        String  aaa= "aaa";
        System.out.println(aaa);
        System.out.println(aaa.hashCode());
        aaa = "bbb";
        System.out.println(aaa);
        System.out.println(aaa.hashCode());
    }

}
