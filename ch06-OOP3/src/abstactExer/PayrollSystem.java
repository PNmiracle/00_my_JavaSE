package abstactExer;

import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        System.out.println("请输入当月月份");

        Scanner sc = new Scanner(System.in);
        int cuMonth = sc.nextInt();
        emps[0] = new SalariedEmployee("zs",
                1001, new MyDate(2000, 1, 1),
                18000);
        emps[1] = new HourlyEmployee("ls", 1002,
                 new MyDate(2001, 4, 7),
                400, 240);
        for (Employee emp : emps) {
            System.out.println(emp);
            if (cuMonth == emp.getBirthday().getMonth()) {
                System.out.println("Happy Birthday and $100 bonus");
            }
        }

    }
}
