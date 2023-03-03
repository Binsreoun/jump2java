package chapter2.ch16;

public class EmployeeTest {

    public static void main(String[] args) {

        System.out.println(Employee.getSerialNumber());

        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");

        System.out.println(employeeLee.getEmployeeName() +"님의 사번은 " + employeeLee.getEmployId() + "입니다.");
        System.out.println(employeeKim.getEmployeeName() +"님의 사번은 " + employeeKim.getEmployId() + "입니다.");
    }
}
