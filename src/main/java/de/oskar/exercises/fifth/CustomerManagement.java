package de.oskar.exercises.fifth;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

// This class extends JFrame to create a custom frame for managing customers
public class CustomerManagement extends JFrame {

    // Selection model for the table of customers
    private ListSelectionModel customerSelectModel;
    // Table model for the table of customers
    private CustomerTableModel customerTableModel;

    // Currently selected customer
    private Customer customer;

    // Constructor that initializes the customerTableModel and sets up the GUI
    public CustomerManagement(Customer[] customers) {
        customerTableModel = new CustomerTableModel(customers);

        // Set up the frame
        setTitle("Customer management");
        setSize(1080, 620);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();
        JMenu menu;
        JMenuItem item;

        // Add a "File" menu to the menu bar
        menuBar.add(menu = new JMenu("File"));

        // Create a table with the customerTableModel
        customerTableModel = new CustomerTableModel(customers);
        JTable table = new JTable(customerTableModel);

        // Set the table's auto resize mode
        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

        // Create a scroll pane with the table
        JScrollPane scrollPane = new JScrollPane(table);

        // Create a panel for the table
        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Tabellenansicht"
        ));
        panel.setLayout(new BorderLayout());
        panel.add(scrollPane);

        // Set the table's selection mode
        table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        customerSelectModel = table.getSelectionModel();
        customerSelectModel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        // Add an "Edit Customers" item to the "File" menu
        menu.add(item = new JMenuItem("Edit Customers"));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Edit the selected customer when the item is clicked
                editCustomer();
            }
        });

        // Add a mouse listener to the table
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                // Edit the selected customer when a row is double clicked
                if (e.getClickCount() == 2) editCustomer();
            }
        });

        // Add a separator to the "File" menu
        menu.add(new JSeparator());

        // Add a "Beeden" item to the "File" menu
        menu.add(item = new JMenuItem("Beeden"));
        item.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Dispose the frame when the item is clicked
                dispose();
            }
        });

        // Set the frame's menu bar and add the panel
        setJMenuBar(menuBar);
        add(panel);
        setVisible(true);
    }

    // Opens a dialog to edit the selected customer
    private void editCustomer() {
        int row = customerSelectModel.getMinSelectionIndex();
        new CustomerEditDialog(this, customerTableModel.getCustomer(row == -1 ? 0 : row));
        customerTableModel.fireTableRowsUpdated(row, row);
    }

    // Returns the currently selected customer
    public Customer getCustomer() {
        return customer;
    }

    // Sets the currently selected customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}