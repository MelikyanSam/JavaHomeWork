package com.company.HomeWork.Work7;

public class Constructor {
    int stck [] ;
    int tos;

    Constructor(int num){
        stck = new int[num];
        tos = -1;
    }

    void push (int item){
        if(tos == stck.length-1)
            System.out.println("Stack is full.");
        else
            stck[++tos] = item;
    }

    int pop(){
        if(tos < 0) {
            System.out.println("Stack is underflow.");
            return 0;
        }
        else
            return stck[tos--];
    }

    public static void main(String[] args) {
        Constructor myStack = new Constructor(100);
        Constructor myStack1 = new Constructor(46);


        for(int i = 1; i < myStack.stck.length; i++){
            myStack.push(i);
        }
        for(int i = 1; i < myStack1.stck.length; i++){
            myStack1.push(i);
        }

        for(int i = 1; i < myStack.stck.length; i++){
            System.out.println(myStack.pop());
        }
        for(int i = 1; i < myStack1.stck.length; i++){
            System.out.println(myStack1.pop());
        }
    }
}
