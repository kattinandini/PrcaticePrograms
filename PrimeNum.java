package com.bridgelab.assinment;
import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter two values...........");
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}



