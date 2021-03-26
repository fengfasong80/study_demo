package com.stydy.game;

/**
 * 基本角色
 * @author fengfasong
 * @date 2020/9/21
 */
public class BasicActor implements Actor{
    /**
     * 攻击力
     */
    private Long agg;
    /**
     * 暴击
     */
    private Double strike;
    /**
     * 防御
     */
    private Long defense;
    /**
     * 血量
     */
    private Long hp;

    protected BasicActor() {
        agg = 10L;
        strike = 0.5;
        defense = 2L;
        hp = 100L;
    }

    @Override
    public Long getAgg() {
        return this.agg;
    }

    @Override
    public Double getStrike() {
        return this.strike;
    }

    @Override
    public Long getDefense() {
        return this.defense;
    }

    @Override
    public Long getHp() {
        return this.hp;
    }
}
