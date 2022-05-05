package com.company.HomeWork.work11;

public abstract class Byke {
    protected int seat;
    protected int wheels;
    protected int speed;
    protected int weight;
    protected boolean automatic;

    Byke() {
        wheels = 2;
        seat = 1;
        speed = speed();
        weight = 11;
        automatic = false;
    }

    Byke(int width) {
        wheels = 2;
        seat = 1;
        speed = speed();
        weight = width;
        automatic = false;
    }
    int speed() {
        if (weight == 0 || weight < 0)
            return speed = -1;
        if (automatic)
            speed = 60;
        else if (weight > 25)
            speed = 8;
        else if (weight < 10)
            speed = 20;
        else if (weight < 25 && weight > 10)
            speed = 15;
        return speed;
    }
    void get() {
        System.out.println("The wheels are " + wheels);
        System.out.println("The seats are " + seat);
        System.out.println("The speed is " + speed);
        System.out.println("The weight is " + weight);
        System.out.println("Does it automatic? " + automatic);
    }
    abstract boolean setAutomatic(boolean a );
    abstract int setSeat(int a );
    abstract int setWeight(int a );
}
