package com;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author lihua
 */
public class Test {

    public static void main(String[] args) {
        //
        System.out.println("Hello World !");
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
        boolean equal = Objects.equals("", "");
        System.out.println(equal);

        for (int j = 0; j < 5; j++) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("^");
        }

    }
}
