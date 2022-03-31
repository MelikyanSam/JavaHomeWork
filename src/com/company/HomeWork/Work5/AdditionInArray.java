package com.company.HomeWork.Work5;

public class AdditionInArray {
    static int additionInArray(int e []){
        int sum = 0;
        for(int i=0; i<e.length;i++){
            sum+=e[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int array[] = {10,45,250,32,5,4,203,95,2};

        System.out.println(additionInArray(array) + " is the addition of array's elements");
    }
}
