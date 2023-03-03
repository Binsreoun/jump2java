package chapter2.ch19;

public class CarTest {

    public static void main(String[] args) {
        CarFactory factory = CarFactory.getInstence();
        Car mySonata = factory.createCar();
        Car yourSonata = factory.createCar();

        System.out.println(mySonata.getCarNumber());
        System.out.println(yourSonata.getCarNumber());

    }
}
