package main.java.de.oskar.exercises.excersiseTwo;

import java.util.ArrayList;
import java.util.List;

public class ExcersieTwo {
    private final List<BereichUmsatz> umsaetze;

    public ExcersieTwo() {
        this.umsaetze  = new ArrayList<>();
    }

    public void printUmstaetze() {
        for (BereichUmsatz umsatz : umsaetze) {
            System.out.println(umsatz.bereich + " (" + umsatz.umsatz + ")");
        }
    }

    public static double avgUmsatz(List<BereichUmsatz> umsaetze) {
        int countEntries = 0;
        double countUmsaetze = 0;
        for (BereichUmsatz bereichUmsatz : umsaetze) {
            countEntries += 1;
            countUmsaetze += bereichUmsatz.umsatz;
        }
        return countUmsaetze/countEntries;
    }

    public static void switchPosition(List<BereichUmsatz> umsaetze, int pos1, int pos2) {
        BereichUmsatz temp = null;
        temp = umsaetze.get(pos1);
        umsaetze.set(pos1, umsaetze.get(pos2));
        umsaetze.set(pos2, temp);
    }

    public static int indexOfMinUmsatz(List<BereichUmsatz> umsaetze) {
        BereichUmsatz temp = null;
        return 0;
    }

    public List<BereichUmsatz> getUmsaetze() {
        return umsaetze;
    }
}
