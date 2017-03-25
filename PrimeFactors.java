package com.company;

public class PrimeFactors {

    public static void main(String[] args) { generatePrimeFactors(30);}

    private static void generatePrimeFactors(int number) {
        for(int i = 2; i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + ",");
                number = number / i;
            }
        }
    }
}
