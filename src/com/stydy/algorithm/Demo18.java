package com.stydy.algorithm;

/**
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target ，
 * 写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
 * @author fengfasong
 * @date 2021/3/22
 */
public class Demo18 {

    public int getTar(int[] arry,int target){

        int left = 0;
        int right = arry.length-1;
        while (left <= right){
            int med = (left+right)/2;
            int end = arry[med];
            if(end == target){
                return end;
            }else if(target < end) {
                right = med-1;
            }else {
                left = med+1;
            }
        }
        return -1;
    }
}
