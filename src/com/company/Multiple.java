package com.company;

public class Multiple extends Greutati {
    Greutati[] greutatiMultiple;

    public Multiple(Greutati[] greutatiMultiple) {
        super();
        this.greutatiMultiple = greutatiMultiple;
    }

    public int getCapacitate() {
        int capacitate = 0;
        for (Greutati greutatiM : greutatiMultiple) {
            capacitate = capacitate + greutatiM.getCapacitate();
        }
        return capacitate;
    }
}
