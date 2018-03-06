package com.bizleap.assignment.nineten;

import java.util.HashMap;

/**
 * Created by M2h_Laptop on 2/8/2018.
 */
public class MyHashTable {
    public static void main(String[] args) {
        String name = "admin";
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(int i=0; i<5; i++){
            char a1 = name.charAt(i);
            hmap.put(a1,(int) a1);
            System.out.println("The number is : "+hmap.get(a1));
        }
        hmap.remove(5);
        System.out.println("True");
    }
}
