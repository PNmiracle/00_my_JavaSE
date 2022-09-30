package ex5;

public class GeometricTest {
    public boolean equalsArea(GeometricObject g1, GeometricObject g2) {
        //return g1.findArea() - g2.findArea();
        return g1.findArea() == g2.findArea();
    }

    public void displayGeometricObject(GeometricObject g) {
        System.out.println("Area is : "+ g.findArea());
    }

    public static void main(String[] args) {
        GeometricTest gt = new GeometricTest();
        MyRectangle r1 = new MyRectangle("red", 1.0, 5.2, 1.2);
        Circle c1 = new Circle("blue", 2.2, 4.2);
        gt.displayGeometricObject(c1);
        gt.displayGeometricObject(r1);
        System.out.println(gt.equalsArea(c1, r1));

    }


}
