package com.company.HomeWork.Work5;

public class SortedInAscendingOrder {
    static int[] inAscendingOrder(int[] e) {
        int z = e[0];
        int var;
        for (int i = 0; i < e.length; i++) {
            for (int j = 0; j < e.length; j++) {
                if (e[j] > z) {
                    z = e[j];
                    var = e[i];
                    e[i] = z;
                    e[j] = var;
                }
            }
            z = e[e.length - 1];
        }
        return e;
    }
    public static void main(String[] args) {
        int array[] = {10,45,250,32,5,4,203,95,2};

        for(int x = 0;x< array.length;x++){
            System.out.println(inAscendingOrder(array)[x]+" : array["+x+"]");
        }
    }
}
