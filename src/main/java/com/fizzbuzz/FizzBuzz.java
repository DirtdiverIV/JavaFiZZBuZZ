package com.fizzbuzz;

public class FizzBuzz {

    public static String getFizzBuzzValue(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FiZZBuZZ";
        } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            return "FiZZ";
        } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "BuZZ";
        } else {
            return String.valueOf(number);
        }
    }

    public static void main(String args[]) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(getFizzBuzzValue(i));
        }
    }
}
