package de.oskar.exercises.fifth;

public class FifthMain {
    public static void main(String[] args) {
        // Create an array of Customer objects
        Customer[] customers = new Customer[3];
        // Initialize the array with Customer objects
        customers[0] = new Customer("Meier", "Josef");
        customers[1] = new Customer("Huber", "Franziska");
        customers[2] = new Customer("Schmidt", "Helmut");

        // Create a new CustomerManagement object with the array of customers
        new CustomerManagement(customers);
    }
}