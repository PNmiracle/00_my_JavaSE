package abstactExer;

public class SalariedEmployee extends Employee {
    private int monthlySalary;
    @Override
    public int earnings() {
        return monthlySalary;
    }

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, int monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public SalariedEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                super.toString() +
                "monthlySalary=" + monthlySalary +
                '}';
    }
}
