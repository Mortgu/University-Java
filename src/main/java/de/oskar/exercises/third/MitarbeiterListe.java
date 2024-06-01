package de.oskar.exercises.third;

public class MitarbeiterListe {

    private int size;
    private Mitarbeiter[] mitarbeiter;

    public MitarbeiterListe(int size) {
        this.size = size;
        mitarbeiter = new Mitarbeiter[size];
    }

    boolean addMitarbeiter(Mitarbeiter mitarbeiter) {
        if (this.mitarbeiter[this.mitarbeiter.length-1] != null) {
            this.size = this.size*2;
            this.mitarbeiter = new Mitarbeiter[this.size];
        }

        for (int i = 0; i < this.mitarbeiter.length; i++) {
            if (this.mitarbeiter[i] == null) {
                this.mitarbeiter[i] = mitarbeiter;
                return true;
            }
        }
        return false;
    }

    Mitarbeiter get(int index) {
        return mitarbeiter[index];
    }

    Mitarbeiter set(int index, Mitarbeiter m) {
        if (index < 0 || index >= this.mitarbeiter.length) {
            return null;
        }
        this.mitarbeiter[index] = m;
        return this.mitarbeiter[index];
    }

    public int getSize() {
        return size;
    }

    boolean remove(Mitarbeiter m) {
        for (int i = 0; i < this.mitarbeiter.length; i++) {
            if (this.mitarbeiter[i] == m) {
                this.mitarbeiter[i] = null;
                return true;
            }
        }
        return false;
    }

    public Mitarbeiter[] getMitarbeiter() {
        return mitarbeiter;
    }
}
