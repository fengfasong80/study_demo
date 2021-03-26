package com.stydy.game;

/**
 * 装备一把剑
 * @author fengfasong
 * @date 2020/9/21
 */
public class AddSword extends ActorDecorate{


    private final Long AGG = 10L;

    protected AddSword(Actor actor) {
        super(actor);
    }

    @Override
    public Long getAgg() {
        return super.getAgg() + AGG;
    }
}
