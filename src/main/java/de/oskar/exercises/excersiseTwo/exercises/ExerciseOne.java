package main.java.de.oskar.exercises;

import java.util.ArrayList;
import java.util.List;

public class ExerciseOne {

    public ExerciseOne() {
        List<Integer> primeNumbers = getPrimeNumbers(1000);
        printList(primeNumbers);
    }

    /* Übungsblatt 1 - Aufgabe 4 */
    public static List<Integer> getPrimeNumbers(int limit) {
        final List<Integer> list = new ArrayList<>();

        if (limit <= 2) return list;

        for (int i = 0; i <= 1000; i++) {
            int counter = 0;
            for (int y = i; y >= 1; y--) {
                if (i % y == 0) {
                    counter++;
                }
            }

            if (counter == 2) {
                list.add(i);
            }
        }

        return list;
    }

    /* Übungsblatt 1 - Aufgabe 4 */
    public static void printList(List<Integer> list) {
        list.forEach((number) -> {
            System.out.println("Prime number: " + number);
        });
    }
}
