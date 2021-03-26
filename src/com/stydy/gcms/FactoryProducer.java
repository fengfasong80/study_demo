package com.stydy.gcms;

/**
 * 工厂生成器
 * @author fengfasong
 * @date 2020/9/21
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if(factory == null){
            return null;
        }
        if("shape".equals(factory)){
            return new ShapeFactory();
        }
        if("color".equals(factory)){
            return new ColorFactory();
        }
        return null;
    }
}
