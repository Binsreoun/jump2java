package chapter2.ch04;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();
        Student studentKim = new Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울시 강남구";
        studentLee.showStudentInfo();


        studentKim.studentID = 54321;
        studentKim.setStudentName("Kim");
        studentKim.address = "경기도 성남시";
        studentKim.showStudentInfo();

        System.out.println(studentKim);
        System.out.println(studentLee);
    }
}
