package Block;
/**
 * @Author mapKey
 * @Date 7/8/2022 2:22 PM
 * @Description 代码块
 * @Since version-1.0
 */

public class BlockTest {
    public static void main(String[] args) {
        String desc = Person.desc;

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
    }
}

class Person {
    String name;
    int age;
    static String desc = "I am a person";

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //代码块
    static {
        System.out.println("Hello, static code block");
    }

    {
        System.out.println("Hello, code block");
    }

    public void eat() {
        System.out.println("A person eats");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


