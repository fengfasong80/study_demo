package com.stydy.file;

import java.io.Serializable;

/**
 * 英雄类
 * @author fengfasong
 * @date 2020/9/22
 */
public class Hero implements Serializable {
    //姓名
    private String name;
    //血量
    private Integer hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }
}
