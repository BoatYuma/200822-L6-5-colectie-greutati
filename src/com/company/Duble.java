package com.company;

public class Duble extends Greutati {
    Greutati g1, g2;

    public Duble(Greutati g1, Greutati g2) {
        this.g1 = g1;
        this.g2 = g2;
    }

    public void setG1(Greutati g1) {
        this.g1 = g1;
    }

    public void setG2(Greutati g2) {
        this.g2 = g2;
    }

    public int capacitate() {
        return (g1.capacitate()+g2.capacitate());
    }
}
