package com.company.HomeWork.Work5;

public class SmallestInmstrix {
    static int smallestInMatrix(int e [][]){
        int k= e[0][0];
        for(int i=0;i< e.length;i++){
            for(int j=0;j<e[i].length;j++){
                if(e[i][j] < k) k = e[i][j];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int matrix[][] = {
                {115,15,24,230,54},
                {845,512,32,75},
                {8,45,23,10,45}
        };
        System.out.println(smallestInMatrix(matrix)+ " is the smallest element in matrix");
    }
}
