package com.company.HomeWork.Work5;

public class SortedInDiscendingorder {
    static int[] inDiscendingOrder(int[] e) {
        int z ;
        int var;
        for (int i = 0; i < e.length; i++) {
            z = e[i];
            for (int j = 0; j < e.length; j++) {
                if(e[j] < z) {
                    z = e[j];
                    var = e[i];
                    e[i] = z;
                    e[j] = var;
                }
            }

        }
        return e;
    }
    public static void main(String[] args) {
        int array[] = {10,45,250,32,5,4,203,95,2};

        for(int x = 0;x< array.length;x++){
            System.out.println(inDiscendingOrder(array)[x]+" : array["+x+"]");
        }
    }
}
