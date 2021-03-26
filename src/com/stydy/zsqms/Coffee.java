package com.stydy.zsqms;

/**
 * 咖啡接口
 * @author fengfasong
 * @date 2020/9/19
 */
public interface Coffee {
    /**
     * 获取花费金额
     * @return
     */
    double getCost();

    /**
     * 获取配料
     * @return
     */
    String getIngredients();
}
