package chapter3.ch03;


public class VIPCustomer extends Customer {

    double salesRatio;
    private String agentID;

    public VIPCustomer(){
        super(0,"no-name");

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";

        System.out.println("VIPCustomer(int, String) call");
    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName);

        bonusRatio = 0.05;
        salesRatio = 0.1;
        customerGrade = "VIP";
        System.out.println("VIPCustomer(int, String) call");
    }


    public String getAgentID() {
        return agentID;
    }
}
