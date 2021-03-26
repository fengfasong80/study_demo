package com.stydy.zsqms;

/**
 * 加糖
 * @author fengfasong
 * @date 2020/9/19
 */
public class WithSugar extends CoffeeDecorator {

    public WithSugar(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public double getCost() {
        double money = 1;
        return super.getCost()+money;
    }

    @Override
    public String getIngredients() {
        String sugar = "糖";
        return super.getIngredients()+","+sugar;
    }
}
