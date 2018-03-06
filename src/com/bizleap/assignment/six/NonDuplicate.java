package com.bizleap.assignment.six;

/**
 * Created by M2h_Laptop on 2/7/2018.
 */
public class NonDuplicate {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 3, 4, 3, 5, 6, 4, 7, 8, 7, 8, 8};

        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println("Number: "+arr[i]+" found repeating at position: "+i+" , repeated at position "+j);
                }
            }
        }

    }
}
