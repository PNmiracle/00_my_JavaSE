package exer;

public class Student {
    int number;
    int state;
    int score;

    public Student(int number) {
        this.number = number;
    }

    public Student(int number, int state, int score) {
        this.number = number;
        this.state = state;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
