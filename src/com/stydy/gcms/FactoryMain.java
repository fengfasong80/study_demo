package com.stydy.gcms;

/**
 * 工厂模式测试
 * @author fengfasong
 * @date 2020/9/21
 */
public class FactoryMain {
    public static void main(String[] args) {
       AbstractFactory factory = FactoryProducer.getFactory("color");
       Color red = factory.getColor("red");
       red.fill();
       Color color = factory.getColor("blue");
       color.fill();
    }
}
