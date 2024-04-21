package de.oskar.exercises.fifth;

import javax.swing.table.AbstractTableModel;

public class CustomerTableModel extends AbstractTableModel {
    private Customer[] customers;

    public CustomerTableModel(Customer[] customers) {
        this.customers = customers;
    }

    public String getColumnName(int column) {
        switch (column) {
            case 0: return "Nachname";
            case 1: return "Vorname";
            default: return null;
        }
    }

    public int getRowCount() {
        return customers.length;
    }

    public int getColumnCount() {
        return 2;
    }

    public Object getValueAt(int row, int column) {
        Customer customer = customers[row];
        switch (column) {
            case 0: return customer.getLastName();
            case 1: return customer.getFirstName();
            default: return null;
        }
    }

    public Customer[] getCustomers() {
        return customers;
    }

    public Customer getCustomer(int row) {
        return customers[row];
    }
}
