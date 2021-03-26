package com.stydy.annotation.bean;

import com.stydy.annotation.annotationtest.Email;
import com.stydy.annotation.annotationtest.Phone;

/**
 * 个人bo
 * @author fengfasong
 * @date 2020/8/31
 */
public class PersonBo {
    /**
     * 个人编号
     */
    private String grbh;
    /**
     * 姓名
     */
    private String name;
    /**
     * 电话
     */
    @Phone(errorMsg = "号码错误")
    private String phone;
    /**
     * 邮箱
     */
    @Email
    private String email;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private Integer age;

    public PersonBo(String name, String phone,String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getGrbh() {
        return grbh;
    }

    public void setGrbh(String grbh) {
        this.grbh = grbh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
