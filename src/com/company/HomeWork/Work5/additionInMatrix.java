package com.company.HomeWork.Work5;

public class additionInMatrix {
    static int additionInMatrix(int e [][]){
        int sum = 0;
        for(int i=0;i< e.length;i++){
            for(int j=0;j<e[i].length;j++){
                sum+=e[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {115,15,24,230,54},
                {845,512,32,75},
                {8,45,23,10,45}
        };
        System.out.println(additionInMatrix(matrix)+ " is the addition in array'a elements");
    }
}
