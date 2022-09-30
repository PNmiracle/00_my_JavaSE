package Exer4;

public class Bank {
    private Customer[] customers = new Customer[20];
    private int numberOfCustomers;

    public Bank() {
    }

    public void addCustomer(String f, String l) {
        Customer cust = new Customer(f, l);
        customers[numberOfCustomers++] = cust;
        //numberOfCustomers++;
    }

    public int getNumberOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        } else {
            throw new RuntimeException(" index out of bound");
        }
    }
}
