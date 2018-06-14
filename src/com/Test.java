package com;

import java.lang.reflect.Method;

/**
 * @author lihua
 */
public class Test {

    public static void main(String[] args) {
        //
        System.out.println("Hello World Keep Coding!!!");
        int i = 1;
        //
        Hello hello = new Hello();
        hello.sayHello(i);
        for (i = 0; i < 2; i++) {
            System.out.println("自动生成for循环，fori");
        }
        if (i == 2) {
            System.out.println("i = " + i);
        }
    }
}
