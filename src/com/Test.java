package com;

/**
 * @author lihua
 */
public class Test {

    public static void main(String[] args) {
        SeasonEnum seasonEnum = SeasonEnum.valueOf("SPRING");
        System.out.println(seasonEnum.getSeq());
    }
}
