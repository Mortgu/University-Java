package de.oskar.exercises.nine;

public class TabellenEintrag {

    private int platz, punkte;
    private String clubName;

    public TabellenEintrag(int platz, String clubName, int punkte) {
        this.platz = platz;
        this.clubName = clubName;
        this.punkte = punkte;
    }

    public int getPlatz() {
        return platz;
    }

    public void setPlatz(int platz) {
        this.platz = platz;
    }

    public int getPunkte() {
        return punkte;
    }

    public void setPunkte(int punkte) {
        this.punkte = punkte;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }
}
