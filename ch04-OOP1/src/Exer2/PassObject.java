package Exer2;

public class PassObject {
    public static void printAreas(Circle c, int time) {
        System.out.println("Radius\t\tArea ");
        /*仅操作一个对象*/
        for (int i = 1; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t" + c.findArea());

        }
    }
}
