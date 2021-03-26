package com.stydy.game;

/**
 * 装饰器
 * @author fengfasong
 * @date 2020/9/21
 */
public abstract class ActorDecorate implements Actor{
    private final Actor actor;

    protected ActorDecorate(Actor actor) {
        this.actor = actor;
    }

    @Override
    public Long getAgg() {
        return actor.getAgg();
    }

    @Override
    public Double getStrike() {
        return actor.getStrike();
    }

    @Override
    public Long getDefense() {
        return actor.getDefense();
    }

    @Override
    public Long getHp() {
        return actor.getHp();
    }
}
