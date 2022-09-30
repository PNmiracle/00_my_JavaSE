package ex7;

import java.util.Objects;

public class Circle extends GeometricObject {
    private double radius;

    public Circle() {
        color = "white";
        radius = 1.0;
        weight = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
        color = "white";
        weight = 1.0;
    }

    public Circle(String color, double weight, double radius) {
        super(color, weight);
        this.radius = radius;

    }




    @Override
    public int hashCode() {
        return Objects.hash(radius);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
