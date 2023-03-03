package chapter2.ch19;

public class CarFactory {

    private static CarFactory instence = new CarFactory();

    private CarFactory(){

    }

    public static CarFactory getInstence() {
        if(instence == null){
            instence = new CarFactory();
        }

        return instence;
    }

    public Car createCar(){
        Car car = new Car();
        return car;
    }
}
