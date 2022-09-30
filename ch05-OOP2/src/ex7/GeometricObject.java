package ex7;

import java.util.Objects;

public class GeometricObject {
    protected String color;
    protected double weight;

    public GeometricObject() {
        color = "white";
        weight = 1.0;
    }

    public GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (!(o instanceof GeometricObject)) return false;
    //    GeometricObject that = (GeometricObject) o;
    //    return Double.compare(that.getWeight(), getWeight()) == 0 &&
    //            getColor().equals(that.getColor());
    //}
    //
    //@Override
    //public int hashCode() {
    //    return Objects.hash(getColor(), getWeight());
    //}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeometricObject)) return false;
        GeometricObject that = (GeometricObject) o;
        return Objects.equals(getColor(), that.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor());
    }
}
