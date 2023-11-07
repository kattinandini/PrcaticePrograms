package com.bridgelab.assinment;
import java.util.*;

public class CuoponNum {


        public static void main(String[] args) {
            int n = 5; // Change this value to generate a different number of coupons
            generateCoupons(n);
        }

        public static void generateCoupons(int n) {
            Random random = new Random();
            int[] generated = new int[n];
            int count = 0;
            while (count < n) {
                int coupon = random.nextInt(100) + 1; // Adjust the range of the coupon number as needed
                if (!contains(generated, coupon, count)) {
                    generated[count] = coupon;
                    System.out.println("Coupon number: " + coupon);
                    count++;
                }
            }
        }

        public static boolean contains(int[] arr, int key, int count) {
            for (int i = 0; i < count; i++) {
                if (arr[i] == key) {
                    return true;
                }
            }
            return false;
        }
    }


