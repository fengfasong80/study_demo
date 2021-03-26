package com.stydy.zsqms;

/**
 * 牛奶
 * @author fengfasong
 * @date 2020/9/19
 */
public class WithMilk extends CoffeeDecorator{

    public WithMilk(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public double getCost() {
        double money = 0.5;
        return super.getCost()+money;
    }

    @Override
    public String getIngredients() {
        String name = "milk";
        return super.getIngredients()+","+name;
    }
}
