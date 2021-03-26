package com.stydy.bilibili;

/**
 * 粉丝
 * @author fengfasong
 * @date 2020/9/19
 */
public class Fans extends Observer {

    private String name;

    private String message;

    private boolean flag = false;

    public Fans(String name) {
        this.name = name;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void update(String s) {
        if(flag){
            System.out.println(name + "已查看动态："+s);
        }
        if(!flag){
            System.out.println(name + "还未查看动态："+s);
        }
    }
    public void read(){
        this.flag = true;
    }
}
