package main.java.bugs.bug_5_NullPointerException;

public class Printer {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void print() {
        // name was unNamed
        if (name == null) {
            System.out.println("name is UnNamed");
            return;
        }
        printString(name);
    }

    private void printString(String s) {
        System.out.println(s + " (" + s.length() + ")");
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.print();
    }
}