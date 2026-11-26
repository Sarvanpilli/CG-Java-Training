package com.pluralsight.calcengine;

public class dowhile {
    public static void main(String[] args) {
        int ival = 5;
        do {
            System.out.print(ival);
            System.out.print(" * 2 = ");
            ival *= 2;
            System.out.println(ival);
        }
        while (ival<25);
    }
}
