public class Graduate extends Student {
    public Graduate(String name, char sex, int age, long number, int math, int english, int computer) {
        super(name, sex, age, number, math, english, computer);
    }
    int id;
    public void info() {
        System.out.println("id: " + id);
    }
}
