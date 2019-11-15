package com.siminfo;

public class Char {
    public static void main(String[] args) {
        char c, d;

        c = 88; // code for X
        d = 'Y';

        System.out.println("c & d: ");
        System.out.println(c + " " + d);

        // char variables behave like integers
        c = 'X';
        System.out.println("c contains " + c);

        c++; // increment c
        System.out.println("c is now " + c);
    }
}


