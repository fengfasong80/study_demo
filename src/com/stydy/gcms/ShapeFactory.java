package com.stydy.gcms;

/**
 * 形状工厂
 * @author fengfasong
 * @date 2020/9/21
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if("Circle".equals(shapeType)){
            return new Circle();
        }
        if("Rectangle".equals(shapeType)){
            return new Rectangle();
        }
        if("Square".equals(shapeType)){
            return new Square();
        }
        return null;
    }

    @Override
    public Color getColor(String colorType) {
        return null;
    }
}
