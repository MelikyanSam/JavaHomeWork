package com.company.HomeWork.Work8;



public class SmallestOfThree {
    int a, b, c;

    SmallestOfThree(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int smallNum(int a,int b){
        return a < b ? a : b;
    }

    double smallestNum(){
        return smallNum(smallNum(a,b),c);
    }

    public static void main(String[] args) {
        SmallestOfThree one = new SmallestOfThree(25,37,29);
        System.out.println("The smallest value is " + one.smallestNum());
    }
}
