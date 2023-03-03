package chapter2.ch09;

public class SubjectTest {
    public static void main(String[] args) {

        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("국어",100);
        studentLee.setMathSubject("수학", 99);


        Student studentKim  = new Student(200, "Kim");
        studentLee.setKoreaSubject("국어",50);
        studentLee.setMathSubject("수학", 90);

        studentLee.showSoreInfo();
        studentKim.showSoreInfo();
    }
}
