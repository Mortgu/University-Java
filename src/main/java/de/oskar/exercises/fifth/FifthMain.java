package de.oskar.exercises.fifth;

public class FifthMain {
    public static void main(String[] args) {
        Customer[] customers = new Customer[3];
        customers[0] = new Customer("Meier", "Josef");
        customers[1] = new Customer("Huber", "Franziska");
        customers[2] = new Customer("Schmidt", "Helmut");

        new CustomerManagement(customers);
    }
}
