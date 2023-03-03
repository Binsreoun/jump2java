package chapter2.ch06;

public class StudentTest {

    public static void main(String[] args) {

        Student studentlee = new Student();

        System.out.println(studentlee.showStudentInfo());

        Student studentkim = new Student(12345,"kim",3);
        System.out.println(studentkim.showStudentInfo());
    }
}
