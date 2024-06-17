package de.oskar.exercises.third;

public class Mitarbeiter {

    private final String name;
    public static int uuid = 0;
    private int id = 0;

    public Mitarbeiter(String name) {
        this.name = name;
        Mitarbeiter.uuid++;
        this.id = Mitarbeiter.uuid;
    }

    public void setId(int uuid) {
        this.id = uuid;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "id=" + this.id + ", name=" + name;
    }
}
