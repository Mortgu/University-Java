package de.oskar.exercises.nine;

import java.util.Comparator;

public class TabellenComparator implements Comparator<TabellenEintrag> {
    @Override
    public int compare(TabellenEintrag o1, TabellenEintrag o2) {
        return o1.getPunkte() >= o2.getPunkte() ? o1.getPunkte() : o2.getPunkte();
    }

}
