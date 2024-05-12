package de.oskar.exercises.third;

public class Mitarbeiter {

    private static int id = 0;
    private String name;

    public Mitarbeiter(String name) {
        this.name = name;
        id++;
    }

    public static void setId(int id) {
        Mitarbeiter.id = id;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "id=" + id + ", name=" + name;
    }
}
