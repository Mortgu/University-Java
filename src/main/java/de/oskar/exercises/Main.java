package de.oskar.exercises;

import de.oskar.exercises.second.ExerciseTwo;
import de.oskar.exercises.third.Mitarbeiter;
import de.oskar.exercises.third.MitarbeiterListe;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        MitarbeiterListe mitarbeiterListe = new MitarbeiterListe(2);

        mitarbeiterListe.add(new Mitarbeiter("Oskar Schindler"));
        mitarbeiterListe.add(new Mitarbeiter("Valentin Schindler"));

        mitarbeiterListe.add(new Mitarbeiter("Tom Schindler"));
        mitarbeiterListe.add(new Mitarbeiter("Andreas Schindler"));

        for (Mitarbeiter m : mitarbeiterListe.getMitarbeiter()) {
            if (m != null) {
                System.out.println(m);
            }
        }

    }

}
