package com.company.HomeWork.Work5;

public class smallestInArray {
    static int smallestInArray(int e []){
        int k = e[0];
        for(int i=0; i<e.length;i++){
            if(e[i] < k) k = e[i];
        }
        return k;
    }
    public static void main(String[] args) {
        int array[] = {10,45,250,32,5,4,203,95,2};

        System.out.println(smallestInArray(array) + " is the smallest element in array");
    }
}
