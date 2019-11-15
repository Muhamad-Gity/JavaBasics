package com.siminfo;

public class LifeTime {
    public static void main(String[] args) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time block is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y); // this always prints new value of y
        }

        /** this program will not compile
        int bar = 1;
        { // creates a new scope
            int bar = 2; // compile-time error - bar already defined!
            System.out.println("bar generates error: " + bar);

        }
         */
    }
}
