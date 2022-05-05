package com.company.HomeWork.work11;

import com.company.HomeWork.Work10.Bycicle;

class Motorcyrcle extends Byke {
    Motorcyrcle() {
        setSeat(2);
        speed();
        setWeight(50);
        setAutomatic(true);
    }

    Motorcyrcle(int weight) {
        setSeat(2);
        speed();
        if(weight < 50) weight = 50;
        setWeight(weight);
        setAutomatic(true);
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


}
