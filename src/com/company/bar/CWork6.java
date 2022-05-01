package com.company.bar;
public class CWork6 {
    int width;
    int height;
    int depth;

    CWork6() {
        width = -1;
        height = -1;
        depth = -1;
    }

    CWork6(int a, int b, int c) {
        width = a;
        height = b;
        depth = c;
    }

    CWork6(int a) {
        width = a;
        height = a;
        depth = a;
    }

    void setVol(int a, int b, int c) {
        width = a;
        height = b;
        depth = c;
    }
     int vol(){
        return width + height + depth;
     }
    public static void main(String[] args) {
        CWork6 box = new CWork6();
        CWork6 box1 = new CWork6(1,3,9);
        CWork6 box2 = new CWork6(7);
        System.out.println(box.vol());
        System.out.println(box1.vol());
        System.out.println(box2.vol());
        box.setVol(1,3,9);
        System.out.println(box.vol());
        






    }
}



