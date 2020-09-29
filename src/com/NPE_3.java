package com;


public class NPE_3 {
    private static Integer integer;

    public static void main(String[] args) {
        // sout if it's not installed
        if (integer == null) {
            System.out.println("Pls install 'integer' variable class NPE_3");
            return;
        }
        int mas[] = {3, 4, 5, 3, 7, 8, integer, 6, 7, 3, 2,};
        for (int i : mas) {
            System.out.println(i);
        }

    }
}
