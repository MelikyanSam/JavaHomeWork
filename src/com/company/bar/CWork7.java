package com.company.bar;
class Test {
    int a,b;
    Test(int j, int i){
        a = j;
        b = i;
    }
    Test (int j){
        this.a = j;
    }
    Test(Test t){
        this.a = t.a;
        this.b = t.b;
    }

    boolean equalTo (Test o){
        return o.a == a && o.b == b ? true : false ;
    }

    Test incrByten(){
        Test temp = new Test (a + 10);

        return temp;
    }

    void print(){
        System.out.println(a  + " is 'a'");
        System.out.println(b + " is 'b");
    }
}
public class CWork7 {
   public static void main(String[] args) {
       Test obj1 = new Test(100, 50);
       Test obj2 = new Test(100, 50);
       Test obj3 = new Test(10, 500);

       Test clone = new Test(obj3);

//       clone.print();

       Test byTen = obj1.incrByten();

       byTen.print();

//       System.out.println("obj1 == obj2 : "  + obj1.equalTo(obj2));
//       System.out.println("obj1 == obj3 : "  + obj1.equalTo(obj3));
//       System.out.println("clone == obj3 : "  + obj3.equalTo(clone));

       System.out.println(byTen);


   }
}
