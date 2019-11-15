package com.siminfo;

public class Scope {
    // Demonstrate block scope
    public static void main(String[] args) {
        int x; // Known to all code within main

        x = 10;
        if (x == 10) { // start new scope
            int y = 20; // known only to this block

            // x & y both known here.
            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
         //y = 100; // error! y not known here

        // x is still known here.
        System.out.println("x is " + x);
    }
}
