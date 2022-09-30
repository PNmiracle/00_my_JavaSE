package ex2;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        height = 1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double findVolume() {
        return height * super.findArea();
    }

    //@Override
    //public double findArea() {
    //    return
    //}
/**
 * @Description 圆柱体的表面积
 * @Param
 * @Return
 */

    @Override
    public double findArea() {
        return super.findArea() * 2 + 2 * Math.PI * getRadius() * height;
    }
}
