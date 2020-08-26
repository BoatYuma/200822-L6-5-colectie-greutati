package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ColectieGreutati colectie1 = new ColectieGreutati();

        Simple greutate1 = new Simple(23);
        colectie1.adauga(greutate1);

        Greutati greutate21 = new Greutati(34);
        Greutati greutate22 = new Greutati(65);
        Duble greutate2 = new Duble(greutate21, greutate22);
        colectie1.adauga(greutate2);

        Greutati[] greutateA = new Greutati[3];
        greutateA[0] = greutate1;
        greutateA[1] = greutate2;
        greutateA[2] = new Simple(100);
        Multiple greutate3 = new Multiple(greutateA);
        colectie1.adauga(greutate3);

        System.out.println("Medie: "+colectie1.medie());
    }
}
