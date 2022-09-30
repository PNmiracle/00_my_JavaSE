package Encapsulation;

public class Triangle {
    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

  /*  public Triangle(double v, double v1) {
        this.base = base;
        this.height = height;
    }*/

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double findArea(){
        return this.height * this.base / 2;
    }
}
