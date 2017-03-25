package com.company;

public class TriangleDiamond {

    public static void main(String[] args) {
	    printOneAsterisk();
        printVerticalLine(3);
        printRightTriangle(3);
        printIsoscelesTriangle(3);
        printHorizontalLine(8);
    }

    private static void printOneAsterisk() {
        System.out.println("*");
    }

    private static void printHorizontalLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
    }

    private static void printVerticalLine(int number) {
        for (int i = 0; i < number; i++) {
            System.out.println("*");
        }
    }

    private static void printRightTriangle(int number) {
        String result = "";

        for (int i = 0; i < number; i++) {
            result += "*";
            System.out.println(result);
        }
    }

    private static void printIsoscelesTriangle(int number) {
        String result = "*";
        // Need to center this
        for (int i = 0; i < number; i++) {
            System.out.println(result);
            result += "**";

        }
    }
}
