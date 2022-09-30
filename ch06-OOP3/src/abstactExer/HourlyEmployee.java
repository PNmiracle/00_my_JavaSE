package abstactExer;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hour;
    @Override
    public int earnings() {
        return wage * hour;
    }

    public HourlyEmployee() {
    }

    public HourlyEmployee(String name, int number, MyDate birthday, int wage, int hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public HourlyEmployee(String name, int number, MyDate birthday) {
        super(name, number, birthday);
    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                super.toString() +
                "monthlySalary=" + wage * hour +
                '}';
    }
}
