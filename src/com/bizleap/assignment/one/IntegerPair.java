package com.bizleap.assignment.one;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by M2h_Laptop on 1/15/2018.
 */
public class IntegerPair {
    public static void main(String args[]) {
        IntegerPair integerPair = new IntegerPair();
        System.out.println(integerPair.getIntegerPairMap());
    }
    public Map getIntegerPairMap(){
        Map<Integer,Integer> integerMap = new <Integer,Integer>HashMap();
        int temp = 0;
        for (int i = 1; i < 21; i++) {

            temp = temp + i;
            integerMap.put(i,temp);
        }
        return integerMap;
    }
}
