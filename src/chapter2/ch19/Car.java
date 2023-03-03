package chapter2.ch19;

public class Car {

    private static int serialNumber = 10000;
    private int CarNumber;

    public Car(){
        serialNumber++;
        CarNumber = serialNumber;
    }

    public int getCarNumber() {
        return CarNumber;
    }

    public void setCarNumber(int carNumber) {
        this.CarNumber = carNumber;
    }
}
