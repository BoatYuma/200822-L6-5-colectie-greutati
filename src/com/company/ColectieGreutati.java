package com.company;

public class ColectieGreutati {
    private Greutati[] colectieGreutati = new Greutati[10];
    private int nrGreutati = 0;

    public void adauga(Greutati greutate) {
        nrGreutati++;
        colectieGreutati[nrGreutati] = greutate;
    }

    public double medie() {
        int capacitateTotala = 0, nr = 0;
        for (Greutati greutati : colectieGreutati
        ) {
            if (greutati != null) {
                nr++;
                capacitateTotala = capacitateTotala + greutati.getCapacitate();
            }
        }
        return (capacitateTotala / nr);
    }

}
