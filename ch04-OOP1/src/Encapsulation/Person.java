package Encapsulation;

public class Person {
    private int age;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 130) {
            this.age = age;
        } else {
            //System.out.println("Wrong input, (0~130)");
            throw new RuntimeException("Wrong Input");
        }
    }

    public Person(int age) {
        this.age = age;
    }

    public Person() {
    }
}
