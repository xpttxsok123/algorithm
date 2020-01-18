package com.xp.array;

public class ReverseArray {

    public static void main(String[] args) {
        int[] a = {1,2,3};
        int i = 0;

        int temp = 0;
        while (i < a.length / 2){
            temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-1-i] = temp;
            i++;
        }

        for (int a1 : a){
            System.out.println(a1);
        }

    }

}
