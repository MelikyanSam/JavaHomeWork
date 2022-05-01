package com.company.bar;

public class CWork8 {
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    private int a;
    private int b;

    CWork8(int a, int b){
        this.a = a;
        this.b = b;
    }
    CWork8(){
        a = a;
        b = b;
    }

    public static void main(String[] args) {
        CWork8 one = new CWork8(2,9);

    }

}
