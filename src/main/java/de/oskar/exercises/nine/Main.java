package de.oskar.exercises.nine;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tabelle tabelle = new Tabelle();
        tabelle.addEintrag("Oskar", 23);
        tabelle.addEintrag("Test", 1);
        tabelle.addEintrag("dwa", 12);
        tabelle.addEintrag("wa", 99);

        tabelle.build();


        for (TabellenEintrag eintrag : tabelle.getTabellenEintragList()) {
            System.out.println("(" + eintrag.getPlatz() + ") " +  eintrag.getClubName() + " with " + eintrag.getPunkte() + " points!");
        }
    }
}
