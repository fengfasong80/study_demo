package com.stydy.zsqms;

/**
 * 装饰器模式测试
 * @author fengfasong
 * @date 2020/9/19
 */
public class MainTest {
    public static void main(String[] args) {
        Coffee coffee = new SimpleCoffee();

        coffee = new WithMilk(coffee);
        coffee = new WithSugar(coffee);
        System.out.println("花费了："+coffee.getCost()+" 加了："+coffee.getIngredients());
    }
}
