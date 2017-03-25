package com.company;

import java.awt.*;

public class TriangleDiamond {

    public static void main(String[] args) {
        printOneAsterisk();
        printVerticalLine(3);
        printRightTriangle(3);
        printIsoscelesTriangle(3);
        printDiamond(3);
        printDiamondWithName(3);
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
        int i, j, k;

        for (i = 0; i < number; i++) {
            for (j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void printDiamond(int number) {
        int i, j, k;

        for (i = 0; i < number; i++) {
            for (j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (i = number - 1; i >= 0; i--) {
            for (j = number - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = number - 2; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private static void printDiamondWithName(int number) {
        int i, j, k;

        for (i = 0; i < number; i++) {
            for (j = 0; j < number - i; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < i * 2 + 1; k++) {
                if (i == number - 1) {
                    System.out.print("~Lexi~");
                    break;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println("");
        }
        for (i = number - 1; i >= 0; i--) {
            for (j = number - 1; j >= 1; j--) {
                System.out.print(" ");
            }
            for (k = number - 2; k <= i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
