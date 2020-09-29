package com;


public class NPE_2 {
    public static void main(String[] args) {
        Grid myGrid = new Grid();
        myGrid.printarray();
    }
}

class Grid {
    private Slot[][] array = new Slot[12][12];
    public Grid() {
    }

    public void printarray() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + "|" + "");
            for (int j = 1; j <= 10; j++) {
                // we need to install slot
                array[i][j] = new Slot();
                System.out.print(array[i][j].getStatus());
            }
            System.out.print("\n");
        }
        System.out.print("\n");

    }
}


class Slot {


    public Slot() {
    }


    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    private int status = 0;
    private int id = 0;

}
