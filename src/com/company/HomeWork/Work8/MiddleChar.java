package com.company.HomeWork.Work8;

public class MiddleChar {
    String s;

    MiddleChar(String a){
        s = a;
    }

    String middleChar(){
        int l = s.length();
        int a = l / 2;
        char m = s.charAt(a);
        String st = s.charAt(a - 1) + String.valueOf(m);

        return   l % 2 != 0 ? String.valueOf(m) : st;
    }

    public static void main(String[] args) {
        MiddleChar one = new MiddleChar("350234");
        System.out.println("The middle character in the string: " + one.middleChar());
    }
}
