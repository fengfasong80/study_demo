package com.stydy.gcms;

/**
 * 抽象工厂
 * @author fengfasong
 * @date 2020/9/21
 */
public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
    public abstract Color getColor(String colorType);
}
