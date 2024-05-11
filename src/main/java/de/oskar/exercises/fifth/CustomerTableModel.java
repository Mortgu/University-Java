package de.oskar.exercises.fifth;

import javax.swing.table.AbstractTableModel;

// This class extends AbstractTableModel to create a custom table model for Customer objects
public class CustomerTableModel extends AbstractTableModel {

    // Array of Customer objects
    private final Customer[] customers;

    // Constructor that initializes the customers array
    public CustomerTableModel(Customer[] customers) {
        this.customers = customers;
    }

    // Returns the name of the column at columnIndex
    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Nachname";
            case 1: return "Vorname";
            default: return null;
        }
    }

    // Returns the number of rows in the model
    public int getRowCount() {
        return customers.length;
    }

    // Returns the number of columns in the model
    public int getColumnCount() {
        return 2;
    }

    // Returns the value for the cell at columnIndex and rowIndex
    public Object getValueAt(int row, int column) {
        Customer customer = customers[row];
        switch (column) {
            case 0: return customer.getLastName();
            case 1: return customer.getFirstName();
            default: return null;
        }
    }

    // Returns the array of customers
    public Customer[] getCustomers() {
        return customers;
    }

    // Returns the Customer object at the specified row
    public Customer getCustomer(int row) {
        return customers[row];
    }
}