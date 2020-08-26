package com.company;

public class Duble extends Greutati {
    Greutati greutate1, greutate2;

    public Duble(Greutati greutate1, Greutati greutate2) {
        this.greutate1 = greutate1;
        this.greutate2 = greutate2;
    }

    public void setG1(Greutati greutate1) {
        this.greutate1 = greutate1;
    }

    public void setG2(Greutati greutate2) {
        this.greutate2 = greutate2;
    }

    public int capacitate() {
        return (greutate1.capacitate() + greutate2.capacitate());
    }
}
