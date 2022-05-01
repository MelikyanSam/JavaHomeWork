package com.company.bar;
class Box{
    int width;
    int depth;
    int height;
}
class Triangle{
    int sideA;
    int sideB;
    int sideC;
    int perimeter(){
        return sideA + sideB + sideC;
    }
    void setTri(int a, int b,int c){
        sideA = a;
        sideB = b;
        sideC = c;
    }

}
public class CWork5 {
    public static void main(String[] args) {
        Triangle t = new Triangle();

        Triangle $3 = new Triangle();
        $3.setTri(20,30, 4);
//        $3.sideA = 10;
//        $3.sideB = 10;
//        $3.sideC = 7;
        System.out.println($3.perimeter() + " perimeter of '$3' triangle");



        CWork6 myBox = new CWork6();

        myBox.width = 2;
        myBox.height = 2;
        myBox.depth = 4;


//        System.out.println(myBox.height);
//        System.out.println(myBox.width);
//        System.out.println(myBox.depth);

        CWork6 b1 = new CWork6();
        CWork6 b2 = b1;
        b1 = null;
//        b2.height = 2;

//        System.out.println(b2.height);
    }
}
