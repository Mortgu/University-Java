package de.oskar.exercises.third;

public abstract class Abrechnung {

    private int periode;
    private final Mitarbeiter mitarbeiter;

    public Abrechnung(int periode, Mitarbeiter mitarbeiter) {
        this.periode = periode;
        this.mitarbeiter = mitarbeiter;
    }

    public int getPeriode() {
        return periode;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public abstract double getVerdienst();

    public String toString() {
        return "periode=" + periode + ", mitarbeiter='" + mitarbeiter.getName() + "', verdienst=" + getVerdienst();
    }
}
