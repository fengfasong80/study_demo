package com.stydy.algorithm;

import java.util.HashMap;
import java.util.Map;

/**
 * 组合
 * @author fengfasong
 * @date 2021/3/4
 */
public class Demo07 {

    public static void main(String[] args) {
        String[] arry = new String[]{"0","2","3","4"};
        countNum(arry);
    }

    /**
     * 不重复的数字，只有个位。
     * @param arry
     * @return
     */
    public static String countNum(String[] arry){
        if(arry.length == 1){
            return arry[0];
        }
        Map<String,String> map = new HashMap<>();
        String temp = "";
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if(i != j){
                    for (int k = 0; k < arry.length; k++) {
                        if(j != k && k != i && !arry[i].equals("0")){
                            temp = arry[i]+arry[j]+arry[k];
                            map.put(temp,String.valueOf(j));
                        }
                    }
                }
            }
        }
        System.out.println(map);
        return null;
    }
}
