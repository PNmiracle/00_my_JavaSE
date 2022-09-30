package ex2;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder.findVolume());

        cylinder.setHeight(2.0);
        cylinder.setRadius(3.0);
        System.out.println(cylinder.findVolume());

    }
}
