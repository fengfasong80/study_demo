package com.stydy.funny;

/**
 * 数字枚举
 * @author fengfasong
 * @date 2020/8/29
 */
public enum Number {

    ONE("一",1),TWO("二",2),THREE("三",3),FOUR("五",5),FIVE("五",5),SIX("六",6),SEVEN("七",7),EIGHT("八",8),NINE("九",9),ZERO("零",0);
    private String chinese;

    private Integer number;

    Number(String chinese, Integer number) {
        this.chinese = chinese;
        this.number = number;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public static Number getNumber(String str){
        for(Number enums : Number.values()){
            if(str.equals(enums.getChinese())){
                return enums;
            }
        }
        return null;
    }
}
