package com.bizleap.assignment.seven;
import java.util.Arrays;
import java.util.HashMap;
/**
 * Created by M2h_Laptop on 2/7/2018.
 */
public class DuplicateNumber {
    public static void main(String[] args) {
        int result = 0;
        int[] arr1 = new int[]{0, 1, 2, 3, 4, 3, 5, 6, 4, 7, 8, 7, 8, 8};
        result = findFrequentNumber(arr1);
        printResult(arr1, result);

    }
    private static void printResult(int[] arr, int result) {
        System.out.println(Arrays.toString(arr));
        if (result == -1) {
            System.out.println("All elements are same ");
        } else {
            System.out.println(("Most frequent number : " + result));
        }
    }
    private static int findFrequentNumber(int[] inputArr) {
        HashMap<Integer, Integer> numberMap = new HashMap<>();
        int result = -1;
        int frequency = -1;
        int value = 0;
        for (int i = 0; i < inputArr.length; i++) {
            frequency = value;
            result = inputArr[i];
            numberMap.put(inputArr[i], value); // put the updated value in the map
        }

        if (frequency == 1)
            return -1;
        return result;
    }

}


