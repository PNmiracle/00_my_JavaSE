package exer;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Comparator;

public class StudentTest {
    public static void main(String[] args) {
        Student[] arr = new Student[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Student(i + 1, (int)(Math.random() * 6 + 1),
                    (int)Math.round(Math.random() * 100));
        }

        for (Student student : arr) {
            if (student.state == 3) {
                System.out.println(student);
            }
        }
        System.out.println("****************************");
        Arrays.sort(arr, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return (o1.score - o2.score);
            }
        });

        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
