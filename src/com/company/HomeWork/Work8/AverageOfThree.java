package com.company.HomeWork.Work8;

public class AverageOfThree {
        int a, b, c;

        AverageOfThree(int x, int y, int z){
            a = x;
            b = y;
            c = z;
        }

        double average(){
            return (a + b + c) / 3;
        }



    public static void main(String[] args) {
        AverageOfThree one = new AverageOfThree(25, 45, 65);
        System.out.println("The average value is " + one.average());

    }
}
