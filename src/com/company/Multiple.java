package com.company;

public class Multiple extends Greutati {
    Greutati[] greutatiMultiple = new Greutati[10];

    public Multiple(Greutati[] greutatiMultiple) {
        super();
        this.greutatiMultiple = greutatiMultiple;
    }

    public int capacitate() {
        int capacitate = 0;
        for (Greutati g : greutatiMultiple) {
            capacitate = capacitate + g.capacitate();
        }
        return capacitate;
    }
}
