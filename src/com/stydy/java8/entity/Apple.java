package com.stydy.java8.entity;

import com.stydy.java8.service.ApplePredicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 苹果实体类
 * @author fengfasong
 * @date 2020/10/9
 */
public class Apple {

    private String color;

    private Double weight;

    public Apple(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
