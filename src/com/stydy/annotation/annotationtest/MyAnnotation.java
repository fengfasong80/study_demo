package com.stydy.annotation.annotationtest;

import java.lang.reflect.Field;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 注解解析
 * @author fengfasong
 * @date 2020/8/31
 */
public class MyAnnotation {
    /**
     * 电话号码检查，主要检查号码位数11位，以及是否为数字组成
     * @param object
     * @return
     * @throws Exception
     */
    public static String checkPhone(Object object) throws Exception {
        /**
         * 获取对象的所有字段
         */
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field item : fields){
            /**
             * 判断字段是否被注解标记
             */
            if(item.isAnnotationPresent(Phone.class)){
                item.setAccessible(true);
                String phoneStr = ((String)item.get(object));
                int phoneSize = phoneStr.length();
                /**
                 * 判断电话是否为11为，错误则抛出异常
                 */
                if(phoneSize != 11){
                    throw new Exception("电话号码位数错误！");
                }
                /**
                 * 判断电话是否为数字组成，否则抛出异常
                 * 该处使用了正则进行判断
                 */
                Matcher matcher = Pattern.compile("^[0-9]*$").matcher(phoneStr);
                if(!matcher.matches()){
                    throw new Exception("请输入整数！");
                }
            }
        }
        return null;
    }

    /**
     * 邮箱检查
     * @param object
     * @return
     * @throws Exception
     */
    public static String checkEmail(Object object) throws Exception {
        Field[] fields = object.getClass().getDeclaredFields();
        for(Field item : fields){
            if(item.isAnnotationPresent(Email.class)){
                item.setAccessible(true);
                String email = (String) item.get(object);
                /**
                 * 邮箱正则
                 */
                Pattern pattern = Pattern.compile("^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$");
                Matcher matcher = pattern.matcher(email);
                boolean matches = matcher.matches();
                if(!matches){
                    throw new Exception("邮箱不合法");
                }

            }
        }
        return null;
    }
}
