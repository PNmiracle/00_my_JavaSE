public class Student extends Person {
    long number;
    int math;
    int english;
    int computer;
    int id;


    public Student(String name, char sex, int age) {
        super(name, sex, age);
    }

    public Student(String name, char sex, int age, long number, int math, int english, int computer) {
        super(name, sex, age);
        this.number = number;
        this.math = math;
        this.english = english;
        this.computer = computer;
    }

    public void info() {
        System.out.println("id: " + id);
    }

}
