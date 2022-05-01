package com.company.HomeWork.Work6.Work6;

public class Rfind {
    static int rfind(int a[], int e){
        int w = 0;
        for(int i = 0; i < a.length; i++){
            if(a[i] == e) {
                w += (a.length-i) - 1;
                break;
            }
        }
        return w;
    }
    public static void main(String[] args) {
        int array[] = {5, 8, 12, 30, 2, 10 };

        System.out.println(rfind(array,8));

    }
}
