package de.oskar.exercises.fifth;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerManagement extends JFrame {

    private ListSelectionModel customerSelectModel;
    private CustomerTableModel customerTableModel;

    private Customer customer;

    public CustomerManagement(Customer[] customers) {
        customerTableModel = new CustomerTableModel(customers);

        setTitle("Customer management");
        setSize(1080, 620);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JMenuBar menuBar = new JMenuBar();
        JMenu menu;
        JMenuItem item;

        menuBar.add(menu = new JMenu("File"));

        menu.add(item = new JMenuItem("Edit Customers"));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                editCustomer();
            }
        });

        customerTableModel = new CustomerTableModel(customers);
        JTable table = new JTable(customerTableModel);
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        customerSelectModel = table.getSelectionModel();
        customerSelectModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (e.getClickCount() == 2) editCustomer();
            }
        });

        menu.add(new JSeparator());

        menu.add(item = new JMenuItem("Beeden"));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });

        setJMenuBar(menuBar);
        add(table);

        setVisible(true);
    }

    private void editCustomer() {
        int row = customerSelectModel.getMinSelectionIndex();
        new CustomerEditDialog(this, customerTableModel.getCustomer(row));
        customerTableModel.fireTableRowsUpdated(row, row);
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
