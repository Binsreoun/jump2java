package chapter2.ch14;

public class TakeTransTest {
    public static void main(String[] args) {

        Student James = new Student("James",5000);

        Student Tomas = new Student("Tomas",10000);
        Student Edward = new Student("Edward",20000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        James.takeBus(bus100);

        Subway greenSubway = new Subway(2);

        Tomas.takeSubway(greenSubway);

        Taxi taxi = new Taxi("잘 간다 운수 택시");

        Edward.takeTaxi(taxi);

        James.showInfo();
        Tomas.showInfo();
        Edward.showInfo();

        bus100.showBusInfo();
        greenSubway.showSubwayInfo();

        bus500.showBusInfo();
        taxi.showTaxiInfo();

    }
}
