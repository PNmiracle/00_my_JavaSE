package interfaceTest.exer;

import abstactExer.HourlyEmployee;

public class InterfaceTest {
    //new Com
    public static void main(String[] args) {
        ComparableCircle c1 = new ComparableCircle();
        ComparableCircle c2 = new ComparableCircle();
        HourlyEmployee hourlyEmployee = new HourlyEmployee();
        //c1.setRadius(1);
        //c2.setRadius(2);
        System.out.println(c1.compareTo(c2));
        System.out.println(c1.compareTo(hourlyEmployee));
    }
}
