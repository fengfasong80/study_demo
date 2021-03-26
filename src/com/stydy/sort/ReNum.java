package com.stydy.sort;

import java.util.HashMap;
import java.util.Map;

/**
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * @author fengfasong
 * @date 2021/3/17
 */
public class ReNum {

    public static Map<Integer,Integer> findNum(int[] arry){
        Map<Integer,Integer> map = new HashMap<>(arry.length);
        for (int i = 0; i < arry.length; i++) {
            if(map.containsKey(arry[i])){
                Integer integer = map.get(arry[i]);
                map.put(arry[i],integer+1);
            }else {
                map.put(arry[i],1);
            }
        }
        return map;
    }
}
