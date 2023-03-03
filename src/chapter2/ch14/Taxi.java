package chapter2.ch14;

public class Taxi {

    String taxiName;
    int passengerCount;
    int money;

    public Taxi(String taxiName){
        this.taxiName = taxiName;
    }
    public void take(int money) {
        this.money += money;
        passengerCount++;
    }

    public void showTaxiInfo(){
        System.out.println(taxiName + " 승객수는 "+ passengerCount + "명이고, 수입은 " + money +"원입니다.");
    }
}
