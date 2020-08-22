package com.company;

public class ColectieGreutati {
    Greutati[] colectieGreutati = new Greutati[10];
    int nrGreutati = 0;

    public void adauga(Greutati g) {
        nrGreutati++;
        colectieGreutati[nrGreutati] = g;
    }

    public double medie() {
        int capacitateTotala = 0, nr = 0;
        for (Greutati greutati : colectieGreutati
        ) {
            if (greutati!=null){
            nr++;
            capacitateTotala = capacitateTotala + greutati.capacitate();
        }}
    return (capacitateTotala/nr);
    }

}
