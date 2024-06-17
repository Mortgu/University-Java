package de.oskar.exercises.third;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.StreamTokenizer;

public class MitarbeiterListe {

    private int size;
    private Mitarbeiter[] mitarbeiter;

    public MitarbeiterListe(int size) throws FileNotFoundException {
        this.size = size;
        mitarbeiter = new Mitarbeiter[size];

        BufferedReader br = new BufferedReader(new FileReader("fileName"));
        StreamTokenizer st = new StreamTokenizer(br);
        st.whitespaceChars(',', ',');
     }

    public boolean add(Mitarbeiter mitarbeiter) {
        if (this.mitarbeiter[this.mitarbeiter.length-1] != null) {
            this.size = this.size*2;

            Mitarbeiter[] temp = new Mitarbeiter[this.size];
            System.arraycopy(this.mitarbeiter, 0, temp, 0, this.mitarbeiter.length);
            this.mitarbeiter = temp;
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
