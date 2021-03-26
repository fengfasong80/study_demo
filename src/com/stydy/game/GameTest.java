package com.stydy.game;

/**
 * 测试
 * @author fengfasong
 * @date 2020/9/21
 */
public class GameTest {
    public static void main(String[] args) {
        Actor actor = new BasicActor();
        actor = new AddSword(actor);
        System.out.println("攻击力"+actor.getAgg());
    }
}
