package com.stydy.common;

import java.lang.reflect.Field;

/**
 * 自定义equals方法
 * @author fengfasong
 * @date 2020/12/1
 */
public class MyEquals extends Object {

    private String name;

    private String school;

    @Override
    public boolean equals(Object obj) {
        Field[] fields = obj.getClass().getDeclaredFields();
        for(Field item : fields){
            if(item.getName() == ""){

            }
        }
        return super.equals(obj);
    }
}
