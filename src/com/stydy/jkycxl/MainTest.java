package com.stydy.jkycxl;

/**
 * 测试
 * @author fengfasong
 * @date 2020/9/21
 */
public class MainTest {
    public static void main(String[] args) {
        TraEntity car = new Car();
        car.setMoney(10L);
        TraEntity ship = new Ship();
        ship.setMoney(20L);
        System.out.println(car.getCost());
        System.out.println(ship.getCost());
    }
}
