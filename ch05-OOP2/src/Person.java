import java.util.Objects;

public class Person {
    String name;
    char sex;
    int age;
    int id;

    public Person() {
    }

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    //@Override
    //public boolean equals(Object o) {
    //    if (this == o) return true;
    //    if (o == null || getClass() != o.getClass()) return false;
    //    Person person = (Person) o;
    //    return sex == person.sex &&
    //            age == person.age &&
    //            id == person.id &&
    //            Objects.equals(name, person.name);
    //}

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age, id);
    }

    //public boolean equals(Object obj) {
    //    if (this == obj) {
    //        return true;
    //    }
    //    if (obj instanceof getClass()){
    //
    //
    //    }
    //}
}
