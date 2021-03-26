package com.stydy.jkycxl;

/**
 * 交通工具(抽象)
 * @author fengfasong
 * @date 2020/9/21
 */
public abstract class TraEntity {

    private Long money;

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    abstract Long getCost();
}
