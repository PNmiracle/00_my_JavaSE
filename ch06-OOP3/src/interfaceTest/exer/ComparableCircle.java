package interfaceTest.exer;

public class ComparableCircle extends Circle implements CompareObject {

    @Override
    public int compareTo(Object o) {
        //同一个引用
        if (this == o) {
            return 0;
        }
        if (! (o instanceof Circle)) {
            throw new RuntimeException("不可比较");
        }
        //return 0;
        //Circle c1 = (Circle) o;
        ComparableCircle c1 = (ComparableCircle) o;
        //return this.getRadius() - c1.getRadius();
        return this.getRadius().compareTo(c1.getRadius());
    }
}
