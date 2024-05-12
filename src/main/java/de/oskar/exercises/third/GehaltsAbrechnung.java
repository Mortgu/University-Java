package de.oskar.exercises.third;

public class GehaltsAbrechnung extends Abrechnung {

    private double gehalt;

    public GehaltsAbrechnung(int periode, Mitarbeiter m, double gehalt) {
        super(periode, m);
        this.gehalt = gehalt;
    }

    @Override
    public double getVerdienst() {
        return gehalt;
    }
}
