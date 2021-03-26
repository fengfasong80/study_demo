package com.stydy.game;

/**
 * 角色属性计算接口
 * @author fengfasong
 * @date 2020/9/21
 */
public interface Actor {
    /**
     * 攻击力计算
     * @return
     */
    Long getAgg();
    /**
     * 暴击
     * @return
     */
    Double getStrike();
    /**
     * 防御
     * @return
     */
    Long getDefense();
    /**
     * 血量值
     * @return
     */
    Long getHp();
}
