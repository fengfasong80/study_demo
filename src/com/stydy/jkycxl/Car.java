package com.stydy.jkycxl;

/**
 * 汽车:具体实体类
 * @author fengfasong
 * @date 2020/9/21
 */
public class Car extends TraEntity{

    @Override
    Long getCost() {
        return super.getMoney()+5L;
    }
}
