package com.stydy.num7;


import java.util.HashMap;
import java.util.Map;

/**
 * 数7
 * @author fengfasong
 * @date 2020/12/21
 *  7 14 17 21 27 28 35 37 42 47 49
 *  7 14 21 28 35 42
 *  7 17 27 37 47 57
 */
public class NumSeven {

    public static int[] newNum7(int[] arry){
        if(arry.length == 0){
            return null;
        }
        int length = arry.length;
        Map<Integer,Integer> map = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            map.put(i,0);
        }
        int temp = 1;
        int numTime = 0;
        while (true) {
            if(addNum(arry) == numTime){
                break;
            }
            if (temp % 7 == 0 || temp % 10 == 7) {
                int flag = temp % arry.length;
                if(flag == 0){
                    Integer integer = map.get(length - 1);
                    map.put(length-1,integer+1);
                }else {
                    Integer integer = map.get(flag - 1);
                    map.put(flag-1,integer+1);
                }
                numTime++;
            }
            temp++;
        }
        System.out.println(numTime);
        System.out.println(temp);
        System.out.println(map);
        return null;
    }

    public static int maxNum(int[] arry){
        if(arry.length == 0){
            return 0;
        }
        int max = 0;
        for (int i = 0; i < arry.length; i++) {
            if(arry[i] > max){
                max = arry[i];
            }
        }
        return max;
    }

    public static int addNum(int[] arry){
        if(arry.length == 0){
            return 0;
        }
        int temp = 0;
        for (int i = 0; i < arry.length; i++) {
            temp = temp+arry[i];
        }
        return temp;
    }

    /**
     * 获取数到最大的的数字
     * @param arry 每个人喊过的次数
     */
    public static int[] num7(int[] arry){
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arry.length; i++) {
            map.put(i,arry[i]);
        }
        int[] test = test(arry);
        int[] newArry = new int[arry.length];
        for(Integer key : map.keySet()){
            for (int i = 0; i < test.length; i++) {
                if(test[i] == map.get(key)){
                    newArry[i] = key;
                }
            }
        }

        return newArry;
    }

    public static int[] test(int[] arry){
        for (int i = 0; i < arry.length-1; i++) {
            for (int j = 1+i; j < arry.length; j++) {
                if(arry[i] > arry[j]){
                    int temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        return arry;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,0,1,1};
        //int i = maxNum(a);
        //System.out.println(i);
        int[] ints = newNum7(a);
        //System.out.println(47/10);
    }
}
