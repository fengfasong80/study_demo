package com.stydy.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


/**
 * 字符串工具类
 * @author fengfasong
 * @date 2020/8/13
 */
public class MyStringUtil {
    /**
     * 字符串转字符数组
     * 点进String类，第一个就可看见下面的定义，可以说字符串就是字符的一个数组
     * private final char value[];
     */
    @Test
    public void test01(){
        /**
         * 定义一个String变量
         */
        String testStr = "abcdefg";
        System.out.println(testStr);
        /**
         * 转换成字符数组，并打印出来
         */
        char[] chars = testStr.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            System.out.println(chars[i]);
        }
    }
    /**
     * 返回字符串长度
     * return value.length
     */
    @Test
    public void test02(){
        String testStr = "abcdefg";
        System.out.println(testStr.length());
    }

    /**
     * 判断字符串是否为空
     * return value.length == 0
     */
    @Test
    public void test03(){
        String testStr = "abcdefg";
        System.out.println(testStr.isEmpty());
    }

    /**
     * 返回指定位置的字符
     * return value[index]
     * 打印了三个接口分别为：！ null o
     * 所以在String里面空格也占一个字符
     */
    @Test
    public void test04(){
        String testStr = "hello world!";
        System.out.println(testStr.charAt(11));
        System.out.println(testStr.charAt(5));
        System.out.println(0);
    }

    /**
     * 获取指定位置字符的代码点，不懂，后期再学
     * 相应的方法：codePointBefore，codePointCount，offsetByCodePoints，
     */
    @Test
    public void test05(){
        String testStr = "hello world!";
        System.out.println(testStr.codePointAt(2));
    }

    /**
     *重0开始截取到8-1的位置的字符放到chars，并重chars[0]开始存放
     */
    @Test
    public void test06(){
        String testStr = "不看源码的程序员不是好程序员！";
        char[] chars = new char[testStr.length()];
        testStr.getChars(0,8,chars,0);
        System.out.println(chars);
    }

    /**
     * 返回字符串在指定编码写的字节数组
     *[B@277050dc
     */
    @Test
    public void test07() throws UnsupportedEncodingException {
        String testStr = "农夫山泉有点甜！";
        try {
            byte[] bytes = testStr.getBytes("UTF-8");
            System.out.println(bytes);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            throw e;
        }

    }

    /**
     * equals方法与==
     */
    @Test
    public void test08(){
        String testStrWhh = "哇哈哈!";
        String testStrNfsc = "农夫山泉!";
        String testStrNfsqCopy = "农夫山泉!";
        String testStrNfscNew = new String("农夫山泉!");
        System.out.println(testStrNfsc == testStrWhh);//false
        System.out.println(testStrNfsc.equals(testStrWhh));//false

        System.out.println(testStrNfsc == testStrNfsqCopy);//true
        System.out.println(testStrNfsc.equals(testStrNfsqCopy));//true

        System.out.println(testStrNfsc == testStrNfscNew);//false
        System.out.println(testStrNfsc.equals(testStrNfscNew));//true
    }

    /**
     * compareTo
     */
    @Test
    public void test09(){
        String testStrWhh = "哇哈哈!";
        String testStrNfsc = "农夫山泉!";
        System.out.println(testStrNfsc.compareTo(testStrWhh));
    }

    /**
     * startsWith
     */
    @Test
    public void test10(){
        String testStrWhh = "哇哈哈!";
        String testStrNfsc = "农夫山泉!";
        System.out.println(testStrNfsc.startsWith("夫",2));
    }

    /**
     * hashCode
     */
    @Test
    public void test11(){
        String testStrWhh = "哇哈哈!";
        System.out.println(testStrWhh.hashCode());
    }

    /**
     * indexOf，lastIndexOf方法，平常用的会比较多
     *查找参数第一次出现的索引
     * 查找参数最后出现的索引
     */
    @Test
    public void test12(){
        String testStrWhh = "哇哈哈!";
        System.out.println(testStrWhh.indexOf("哈"));
        System.out.println(testStrWhh.lastIndexOf("哈"));
    }

    /**
     * substring,截取字符传，该方法用的比较多，业务中通常会进行时间的截取
     */
    @Test
    public void test13(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        LocalDateTime localDate = LocalDateTime.now();
        String format = dtf.format(localDate);
        System.out.println(format);//2020-08-14

        System.out.println(format.substring(3));//取索引3后面的字符，包括3

        System.out.println(format.substring(0,9));//取索引1到4的字符，包括1，不包括4
    }

    /**
     *subSequence返回字符的一个子字符串
     */
    @Test
    public void test14(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String format = dtf.format(localDate);
        System.out.println(format);
        System.out.println(format.subSequence(2, 5));
    }

    /**
     *concat,在原有字符串后面添加拼接新的字符串
     */
    @Test
    public void test15(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String format = dtf.format(localDate);
        System.out.println(format.concat("999"));
    }

    /**
     *replace方法，这个方法用的也比较多，注意的地方就是转义字符
     */
    @Test
    public void test16(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String format = dtf.format(localDate);
        System.out.println(format);
        System.out.println(format.replace("-", "/"));

        String testStr = "\"有双引号的字符\"";
        System.out.println(testStr);
        System.out.println(testStr.replace("\"", ""));

        String testStr2 = "\\有斜杠的字符\\";
        System.out.println(testStr2);
        System.out.println(testStr2.replace("\\", ""));
    }

    /**
     * matches,是否匹配指定字符串
     */
    @Test
    public void test17(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String format = dtf.format(localDate);
        System.out.println(format);
        System.out.println(format.matches("2020-11-09"));
    }

    /**
     *contains,是否含有指定字符串
     */
    @Test
    public void test18(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String format = dtf.format(localDate);
        System.out.println(format.contains("2020"));
    }

    /**
     * split，以指定字符进行分割，返回一个字符串数组
     */
    @Test
    public void test19(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String format = dtf.format(localDate);
        String[] split = format.split("-");
        String[] strings = format.split("-", 2);
        Arrays.stream(strings).forEach(p -> System.out.println(p));
        Arrays.stream(split).forEach(p -> System.out.println(p));

    }

    /**
     *join，应该是java8新出的方法，能将数组以指定的字符进行分割，组成一个字符串
     */
    @Test
    public void test20(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.now();
        String format = dtf.format(localDate);
        String[] split = format.split("-");
        String join = String.join(",", split);
        System.out.println(join);
    }

    /**
     * toLowerCase,toUpperCase英文大小写转换
     */
    @Test
    public void test21(){
        String testStr = "abcdefgHJK";
        System.out.println(testStr);
        System.out.println(testStr.toLowerCase(Locale.US));
        System.out.println(testStr.toUpperCase(Locale.US));
        System.out.println(0 % 2);
    }

    /**
     * trim去除字符传两端的空格
     */
    @Test
    public void test22(){
        String testStr = "  一二 三四 五六    ";
        System.out.println(testStr.trim());
    }

    /**
     * 使用字符传方法生成一个编号
     * 规则：FFS+年份+月份+号数+6位数字（从一开始，每次加1）
     */
    @Test
    public void test23(){
        /**
         * 定义一个初始编号
         */
        String oldNum = "FFS20200814000001";
        /**
         * 得到数字部分，新编号根据规则进行+1
         * 此处需要注意，6位数字如果到达999999将会进1，所以此处数字得根据业务情况处理，此处不进行处理
         */
        String number = oldNum.substring(3,17);
        Long newNumber = Long.parseLong(number)+1;
        LocalDate localDate =LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String format = dtf.format(localDate);
        /**
         * 得到年份
         * 此处根据业务需求，可能会进行年度清零，即每一年开始，最后的6位数字都重新开始
         */
        String year = format.substring(0,4);
        String month = format.substring(5,7);
        String day = format.substring(8,10);

        String newNumStr = String.valueOf(newNumber).substring(8,14);

        String newNum = "FFS"+year+month+day+newNumStr;
        System.out.println(newNum);

    }

    @Test
    public void test24(){
        List<String> queryList = new ArrayList<>(Arrays.asList("1001","1002","100301"));
        List<String> resultList = new ArrayList<>(Arrays.asList("100101","1001","100102","100302","1004"));
        List<String> resultList2 = new ArrayList<>();
        for(String str : queryList){
            for(String re : resultList){
                if(re.contains(str)){
                    resultList2.add(re);
                }
            }
        }
        System.out.println(resultList2.toString());
    }

    /**
     *
     */
    @Test
    public void test25(){
        String yyy = "DTLTYP1202100403340077426202011198974819700000775";
        System.out.println(yyy.substring(0,6));
    }

    @Test
    public  void contractId(){
        String contractId = "01581034007742600100201129001100011226102";
        Integer num = 60 - contractId.length();
        System.out.println();
//        if(contractId.length() > 60){
//            System.out.println(contractId);
//        }
//        if(contractId.length() == 60){
//            System.out.println(contractId);
//        }
        if(contractId.length() < 60){
            for(int i = 0;i < num;i++){
                contractId = contractId + " ";
            }
            System.out.println(contractId);
        }
        System.out.println(contractId.length());
    }

    @Test
    public void test000(){
        String str = "shuayydsy";
        StringBuilder stringBuilder = new StringBuilder(str);
        for(int i = 0;i<10;i++){
            stringBuilder.append(" ");
        }
        stringBuilder.append("end");
        System.out.println(String.valueOf(stringBuilder));
    }

    @Test
    public void test111(){
        String fileName = "TXNTYP121210540100340077426202012070473485900000511";
        System.out.println(fileName.substring(10, 16));
    }

    @Test
    public void test112(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        String format = dtf.format(LocalDate.now());
        System.out.println(format);
    }

    @Test
    public void test113(){
        String amount = "201923";
        BigDecimal newAmount = new BigDecimal(amount);
        BigDecimal money = newAmount.divide(new BigDecimal(88),2,BigDecimal.ROUND_HALF_UP);
        System.out.println(money);
    }

    @Test
    public void test114(){
        int[] arry = new int[]{1,2,3,4,5,6,7,8};
        int[] newAry = new int[2];
        System.arraycopy(arry,4,newAry,0,2);
        Arrays.stream(newAry).forEach(p->System.out.println(p));
        //System.out.println(newAry[0]);
    }

}
