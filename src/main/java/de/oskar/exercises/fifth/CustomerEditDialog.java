package de.oskar.exercises.fifth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerEditDialog extends JDialog {

    private Customer customer;

    private JTextField txtFirstName, txtLastName;

    class MyOkHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            customer.setLastName(txtLastName.getText());
            customer.setFirstName(txtFirstName.getText());
            dispose();
        }
    }

    class MyCancelHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }

    public CustomerEditDialog(JFrame parent, Customer customer) {
        super(parent);
        this.customer = customer;

        setLayout(new GridLayout(3, 2));

        add(new JLabel("Nachname:"));
        add(txtLastName = new JTextField(customer.getLastName()));
        add(new JLabel("Vorname:"));
        add(txtFirstName = new JTextField(customer.getFirstName()));

        JButton cmdok = new JButton("OK");
        add(cmdok);
        JButton cmdcancel = new JButton("Abbrechen");
        add(cmdcancel);

        cmdok.addActionListener(new MyOkHandler());
        cmdcancel.addActionListener(new MyCancelHandler());

        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
    }
}
