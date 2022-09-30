package ex7;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle("blue", 2.0, 4.2);
        Circle c2 = new Circle("red", 2.0, 4.2);
        boolean equals = c1.equals(c2);
        System.out.println(equals);

        System.out.println(c1);
        System.out.println(c2.toString());

    }
}
