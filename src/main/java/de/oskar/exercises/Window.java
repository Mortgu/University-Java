package de.oskar.exercises;

import javax.swing.*;

public class Window {

    public static void main(String[] args) {
        JFrame frame = new JFrame("TEst");
        frame.setSize(1080, 620);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }
}
