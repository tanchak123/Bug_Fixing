package com;


public class NPE_1 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}

class Printer {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        printString(name);
    }

    private void printString(String s) {
        // sout if name not set
        if (s == null) {
            System.out.println("Pls use setName");
            return;
        }
        System.out.println(s + " (" + s.length() + ")");
    }

}
