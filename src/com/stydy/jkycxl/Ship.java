package com.stydy.jkycxl;

/**
 * 船,具体实现类
 * @author fengfasong
 * @date 2020/9/21
 */
public class Ship extends TraEntity{


    @Override
    Long getCost() {
        return super.getMoney()+10L;
    }
}
