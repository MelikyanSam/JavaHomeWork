package com.company.HomeWork.Work10;

public class Bycicle {
    private int wheels;
    private int seat;
    private int speed;
    private int weight;
    private boolean automatic;

    Bycicle() {
        wheels = 2;
        seat = 1;
        speed = speed();
        weight = 11;
        automatic = false;
    }

    Bycicle(int width) {
        wheels = 2;
        seat = 1;
        speed = speed();
        weight = width;
        automatic = false;
    }

    void get() {
        System.out.println("The wheels are " + wheels);
        System.out.println("The seats are " + seat);
        System.out.println("The speed is " + speed);
        System.out.println("The weight is " + weight);
        System.out.println("Does it automatic? " + automatic);
    }
    boolean setAutomatic(boolean a ){
        return automatic = a;
    }
    int setSeat(int a ){
        return seat = a;
    }
    int setWeight(int a ){
        return weight = a;
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
}
