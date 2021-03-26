package com.stydy.gcms;

/**
 * 颜色工厂
 * @author fengfasong
 * @date 2020/9/21
 */
public class ColorFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        if(colorType == null){
            return null;
        }
        if("blue".equals(colorType)){
            return new Blue();
        }
        if("yellow".equals(colorType)){
            return new Yellow();
        }
        if("red".equals(colorType)){
            return new Red();
        }
        return null;
    }
}
