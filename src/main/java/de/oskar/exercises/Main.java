package de.oskar.exercises;

import de.oskar.exercises.second.ExerciseTwo;

public class Main {
    public static void main(String[] args) {
        ExerciseTwo exerciseTwo = new ExerciseTwo();

        exerciseTwo.setRevenue("Bremen", 5000.0);
        exerciseTwo.setRevenue("Dresden", 9000.0);
        exerciseTwo.setRevenue("Frankfurt", 12000.0);
        exerciseTwo.setRevenue("Hamburg", 1000.0);
        exerciseTwo.setRevenue("Hannover", 8000.0);
        exerciseTwo.setRevenue("Köln", 3000.0);
        exerciseTwo.setRevenue("Leipzig", 3000.0);
        exerciseTwo.setRevenue("München", 4000.0);
        exerciseTwo.setRevenue("Potsdam", 5000.0);
        exerciseTwo.setRevenue("Stuttgart", 8000.0);

        ExerciseTwo.setFlop(exerciseTwo.getRevenues());
        System.out.println();

        exerciseTwo.printRevenue();

        new Test();

    }

}
