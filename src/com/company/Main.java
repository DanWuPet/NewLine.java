package com.company;

public class Main {

    public static void newLine() {
        System.out.println("*");
    }

    public static void threeLine() {
        newLine();
        newLine();
        newLine();
    }

    public static void nineLine() {
        threeLine();
        threeLine();
        threeLine();
    }

    public static void main(String[] args) {
        System.out.println("First Line.");
        nineLine();
        System.out.println("Second Line.");
    }
}
