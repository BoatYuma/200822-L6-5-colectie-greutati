package com.company;

public class Main {

    public static void main(String[] args) {

        ColectieGreutati colectie1 = new ColectieGreutati();

        //greutate simpla
        Simple greutate1Simpla = new Simple(23);
        colectie1.adauga(greutate1Simpla);

        //greutate dubla
        Greutati greutate21Simpla = new Greutati(34);
        Greutati greutate22Simpla = new Greutati(65);
        Duble greutate2Dubla = new Duble(greutate21Simpla, greutate22Simpla);
        colectie1.adauga(greutate2Dubla);

        //greutate multipla
        Greutati[] greutateAMultipla = new Greutati[3];
        greutateAMultipla[0] = greutate1Simpla;
        greutateAMultipla[1] = greutate2Dubla;
        greutateAMultipla[2] = new Simple(100);
        Multiple greutate3Multipla = new Multiple(greutateAMultipla);
        colectie1.adauga(greutate3Multipla);

        System.out.println("Medie: " + colectie1.medie());
    }
}
