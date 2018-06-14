package com;

import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * Created by DELL on 2018/6/14.
 */
public class TestPojo {
    private Integer age;
    private Boolean flag;
    private static final String THIS_CLASS_STR = "thisClassStr";

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "TestPojo{" +
                "age=" + age +
                ", flag=" + flag +
                '}';
    }
}
