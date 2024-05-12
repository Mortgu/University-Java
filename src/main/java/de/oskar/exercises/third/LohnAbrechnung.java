package de.oskar.exercises.third;

public class LohnAbrechnung extends Abrechnung {

    private double stundenLohn;
    private double anzahlStunden;

    public LohnAbrechnung(int periode, Mitarbeiter mitarbeiter, double stundenLohn, double anzahlStunden) {
        super(periode, mitarbeiter);
        this.stundenLohn = stundenLohn;
        this.anzahlStunden = anzahlStunden;
    }

    @Override
    public double getVerdienst() {
        return stundenLohn * anzahlStunden;
    }
}
