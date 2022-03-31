package com.company.HomeWork.Work5;

public class SpecificNumber {
    static int[] sprcificNumber(int[] e, int num){
        for(int g=0; g<e.length;g++){
            if(e[g] == num) {
                System.out.println("This array contain's a number " + num);
                break;
            }
            else if(g == e.length-1){
                System.out.println("This array do not contain's a number " + num);
            }
        }
        return e;
    }
    public static void main(String[] args) {
        int array[] = {10,45,250,32,5,4,203,95,2};

        sprcificNumber(array,175);
    }
}
