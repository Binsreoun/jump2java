package chapter2.ch16;

public class Employee {

    private static int serialNumber = 1000;

    private int employId;
    private String employeeName;
    private String department;

    public static int getSerialNumber() {
        return serialNumber;
    }

    public Employee(){
        serialNumber++;
        employId = serialNumber;
    }
    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
