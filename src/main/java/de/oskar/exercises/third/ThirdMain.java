package de.oskar.exercises.third;

public class ThirdMain {

    public static void main(String[] args) {
        Mitarbeiter mitarbeiter = new Mitarbeiter("Oskar", "Sammet");
        Mitarbeiter mitarbeiter2 = new Mitarbeiter("Tom", "Rauh");

        GehaltsAbrechnung gehaltsAbrechnung =
                new GehaltsAbrechnung(2, mitarbeiter, 2500.0);
        LohnAbrechnung lohnAbrechnung =
                new LohnAbrechnung(2, mitarbeiter, 33, 84.95);

        GehaltsAbrechnung gehaltsAbrechnung2 =
                new GehaltsAbrechnung(3, mitarbeiter2, 2500.0);
        LohnAbrechnung lohnAbrechnung2 =
                new LohnAbrechnung(3, mitarbeiter2, 33, 84.95);

        System.out.println(gehaltsAbrechnung);
        System.out.println(lohnAbrechnung);

        System.out.println(gehaltsAbrechnung2);
        System.out.println(lohnAbrechnung2);
    }
}
