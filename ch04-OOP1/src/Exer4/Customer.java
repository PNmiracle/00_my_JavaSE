package Exer4;



public class Customer {
    private String firstName;
    private String lastName;
    private Account account;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    //@Override
    //public String toString() {
    //    return "Customer[" + firstName +
    //            ", " + lastName + "has a account: " +
    //            "id is " + account.getId() + "," +
    //            "annualInterestRate is" + account.getAnnualInterestRate() + "," +
    //            "balance is" + account.getBalance();
    //}


    @Override
    public String toString() {
        return "Customer{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", account=" + account +
                '}';
    }
}
