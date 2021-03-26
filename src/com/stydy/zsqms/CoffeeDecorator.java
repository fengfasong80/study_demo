package com.stydy.zsqms;

/**
 * 装饰器
 * @author fengfasong
 * @date 2020/9/19
 */
public abstract class CoffeeDecorator implements Coffee{
    protected final Coffee decoratorCoffee;

    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }

    @Override
    public double getCost() {
        return decoratorCoffee.getCost();
    }

    @Override
    public String getIngredients() {
        return decoratorCoffee.getIngredients();
    }
}
