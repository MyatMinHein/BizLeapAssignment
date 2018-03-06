package com.bizleap.assignment.seven;

/**
 * Created by M2h_Laptop on 2/8/2018.
 */
public class DuplicateNumberWithoutArray {
    public static void main(String[] args) {


        String guess = "1,2,3,4,4";
        int[] temp = new int[5];
        String[] parts = guess.split(",");
        for(int i=0; i<parts.length; i++)
        {
            temp[i] = Integer.parseInt(parts[i]);
            System.out.print(temp[i]);
        }
        System.out.println();
        for(int i=0; i<temp.length;i++){
            for(int j=i+1; j<temp.length;j++){
                if(temp[i] == temp[j]){
                    System.out.println("Repeated Number: "+temp[i]);
                }
            }
        }
    }
}
