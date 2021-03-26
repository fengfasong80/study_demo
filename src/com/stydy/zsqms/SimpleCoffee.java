package com.stydy.zsqms;

/**
 * 原味咖啡
 * @author fengfasong
 * @date 2020/9/19
 */
public class SimpleCoffee implements Coffee{

    @Override
    public double getCost() {
        return 1;
    }

    @Override
    public String getIngredients() {
        return "coffee";
    }
}
