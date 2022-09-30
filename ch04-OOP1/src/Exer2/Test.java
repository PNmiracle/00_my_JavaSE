package Exer2;

public class Test {
    public static void main(String[] args) {
        //PassObject passObject = new PassObject();
        //Circle circle = new Circle();
        /*静态方法用类 . 方法名 来调用
        * 匿名对象
        * */
        PassObject.printAreas(new Circle(), 8);
    }
}
