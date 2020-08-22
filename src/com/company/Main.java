package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ColectieGreutati colectie1 = new ColectieGreutati();

        Simple g1 = new Simple(23);
        colectie1.adauga(g1);

        Greutati g21 = new Greutati(34);
        Greutati g22 = new Greutati(65);
        Duble g2 = new Duble(g21, g22);
        colectie1.adauga(g2);

        Greutati[] ga = new Greutati[3];
        ga[0] = g1;
        ga[1] = g2;
        ga[2] = new Simple(100);
        Multiple g3 = new Multiple(ga);
        colectie1.adauga(g3);

        colectie1.medie();
    }
}
