package de.oskar.exercises.third;

public class ThirdMain {

    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Oskar", "Sammet");

        GehaltsAbrechnung gehaltsAbrechnung =
                new GehaltsAbrechnung(2, mitarbeiter, 2500.0);
        LohnAbrechnung lohnAbrechnung =
                new LohnAbrechnung(2, mitarbeiter, 33, 84.95);

        System.out.println(gehaltsAbrechnung.toString());
        System.out.println(lohnAbrechnung.toString());
    }
}
