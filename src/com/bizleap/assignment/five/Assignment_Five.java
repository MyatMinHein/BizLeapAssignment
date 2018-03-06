package com.bizleap.assignment.five;

/**
 * Created by M2h_Laptop on 2/7/2018.
 */
class PutString {
    public static void main(String[] args) {
        String str[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","30"};
        int arr[]=new int[str.length];

        for(int i=0;i<str.length;i++)
        {
            arr[i]=Integer.parseInt(str[i]);
            if(arr[i] % 3 == 0){
                str[i] += " Biz";
            }
            if(arr[i] % 5 == 0){
                str[i] += " Leap";
            }
            else if(arr[i] % 5 == 0 && arr[i] % 3 == 0){
                str[i] += " BizLeap";
            }
            System.out.println(str[i]);
        }
    }
}