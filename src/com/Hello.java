package com;

/**
 * Created by DELL on 2018/6/13.
 */
public class Hello implements HelloAble{
    static final String HELLO = "hello !!";

    private void hello() {
        System.out.println(HELLO);
    }

    public void sayHello(int num) {
        for (int i = 0; i < 3; i++) {
            hello();
        }
        System.out.println(num);
        hello();

    }
}

