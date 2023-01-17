package com.codebytrust;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Principal Rate:");
        int principalRate = scanner.nextInt();

        System.out.println("Annual Interest Rate:");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.println("Period (Years):");
        byte years = scanner.nextByte();
        int numbersOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principalRate * (monthlyInterest * Math.pow(1 + monthlyInterest, numbersOfPayments)) /(Math.pow(1 + monthlyInterest, numbersOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage:" + mortgageFormatted);
    }
}
