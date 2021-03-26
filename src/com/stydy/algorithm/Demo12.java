package com.stydy.algorithm;

/**
 * 规律数据求和
 * @author fengfasong
 * @date 20201/3/6
 */
public class Demo12 {

    public static void main(String[] args) {
        System.out.println(countSum());
    }
    private static double countSum(){
        double fm=1;
        double fz=2;
        double p=0;
        for (int i = 1; i <= 20; i++) {
            p = p + fz/fm;
            fm = i;
            fz = fz + fm;
        }
        return p;
    }

}
