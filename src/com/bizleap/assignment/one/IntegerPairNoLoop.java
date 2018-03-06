package com.bizleap.assignment.one;

/**
 * Created by M2h_Laptop on 1/15/2018.
 */
public class IntegerPairNoLoop {
    static int n = 1, temp = 0;

    static void NoLoop() {

        if (n <= 20) {
            temp = temp + n;
            System.out.println(n + " = " + temp);
            n++;
            NoLoop();
        }
    }



    public static void main(String[] args) {
        NoLoop();

    }
}
