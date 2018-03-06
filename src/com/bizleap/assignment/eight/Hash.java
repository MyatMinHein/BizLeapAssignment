package com.bizleap.assignment.eight;

/**
 * Created by M2h_Laptop on 2/8/2018.
 */
public class Hash {
    public static void main(String[] args) {
        Hash h=new Hash();
        System.out.println(h.getHashValue("admin asdfgaddsss ab"));

    }
    public int getHashValue(String strValue) {
        int total = 0;
        for(int i=0; i< strValue.length(); i++){
            char a1 = strValue.charAt(i);
            total += a1;
        }
        return total%256;
    }
}
