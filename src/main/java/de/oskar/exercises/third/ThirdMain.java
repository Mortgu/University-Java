package de.oskar.exercises.third;

public class ThirdMain {

    public static void main(String[] args) {
        Mitarbeiter peter = new Mitarbeiter("Peter Fox");
        Mitarbeiter hans = new Mitarbeiter("Hans");

        GehaltsAbrechnung gehaltsAbrechnung =
                new GehaltsAbrechnung(1, peter, 2500.0);
        LohnAbrechnung lohnAbrechnung =
                new LohnAbrechnung(1, peter, 33, 84.95);

        GehaltsAbrechnung gehaltsAbrechnung2 =
                new GehaltsAbrechnung(2, hans, 2500.0);
        LohnAbrechnung lohnAbrechnung2 =
                new LohnAbrechnung(2, hans, 14, 15);

        System.out.println(gehaltsAbrechnung);
        System.out.println(lohnAbrechnung);

        System.out.println(gehaltsAbrechnung2);
        System.out.println(lohnAbrechnung2);
    }
}
