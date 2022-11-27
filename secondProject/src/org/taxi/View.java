package org.taxi;

import org.car.Car;

import static org.car.Category.*;

public class View {
    public static void main(String[] args) {
        Car car1 = new Car(220, 15, 15000, "Volkswagen Polo", ECONOMIC, "2010 BL-9");
        Car car2 = new Car(250, 17, 12000, "Hyundai Solaris", ECONOMIC, "1410 IP-7");
        Car car3 = new Car(220, 22, 18400, "Toyota Camry", COMFORT, "4314 KI-5");
        Car car4 = new Car(280, 40, 100000, "Mercedes-Benz E-class", BUSINESS, "1901 MP-7");
        TaxiStation station = new TaxiStation("Yandex");
        station.addCar(car1);
        station.addCar(car2);
        station.addCar(car3);
        station.addCar(car4);
        station.print();
        System.out.println("Sorted:");
        station.sortCars();
        station.print();
        System.out.println("Cost of taxi station: " + station.calculateCost() + "$");
        station.findNecessaryCar();

    }
}
