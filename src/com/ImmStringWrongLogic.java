package com;


public class ImmStringWrongLogic {

    public static void main(String[] args) {
        String str = "test";
        for (int i = 0; i < 4; i++) {
           str = str.concat(String.valueOf(i));
        }
        System.out.println(str);///should be test0123
    }
}
