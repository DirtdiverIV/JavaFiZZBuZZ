package com.fizzbuzz;

public class FizzBuzz {

    public static void main (String args[]) {
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FiZZBuZZ");
            } else if (i % 3 == 0){
                System.out.println("FiZZ");
            } else if (i % 5 == 0){
                System.out.println("Buzz");

            } else if (String.valueOf(i).contains("3")) {
                System.out.println("FiZZ");

            } else if (String.valueOf(i).contains("5")) {
                System.out.println("BuzZZ");

            }else {
                System.out.println(i);
            }

        }
    }
    
}
