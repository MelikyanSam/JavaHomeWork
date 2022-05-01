package com.company.bar;

class Outer {
    int outer_x = 100;

    void test() {
        class Inner {
            void display() {
                System.out.println("display :  outer_x = " + outer_x);
            }
        }

        Inner inner = new Inner();
        
        for (int i = 0; i < 10; i++) {
            inner.display();
        }
    }


}

public class CWork9 {
    public static void main(String[] args) {
        Outer one = new Outer();
        one.test();
    }


}
