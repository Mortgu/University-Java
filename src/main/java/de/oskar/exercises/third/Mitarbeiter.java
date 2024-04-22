package de.oskar.exercises.third;

public class Mitarbeiter {

    private static int id = 0;
    private String firstName, lastName;

    public Mitarbeiter(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        id++;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName;
    }
}
