package com.bizleap.assignment.one;

/**
 * Created by M2h_Laptop on 1/15/2018.
 */
public class IntegerPair {
    public static void main(String args[]) {
        int i = 1, j = 2;
        for (int n = 1; n < 21; n++)

            if (n % 2 == 1) {
                System.out.println(n + " = " + (n * i));
                i = i + 1;
            } else {
                System.out.println(n + " = " + ((n * j) - (n / 2)));
                j = j + 1;
            }

        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println("------------------------------------------------------------------------------");
        int temp = 0;
        for (int k = 1; k < 21; k++) {

            temp = temp + k;
            System.out.println(k + "=" + temp);
        }
    }
}
