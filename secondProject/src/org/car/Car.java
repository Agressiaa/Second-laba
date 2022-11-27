package org.car;

public class Car implements Comparable<Car> {
    private int speed;
    private float fuelConsumption;
    private int cost;
    private String title;
    private Category type;
    private String number;

    public Car(int speed, float fuelConsumption, int cost, String title, Category type, String number) {
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.cost = cost;
        this.title = title;
        this.type = type;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getType() {
        return type;
    }

    public void setType(Category type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", fuelConsumption=" + fuelConsumption +
                ", cost=" + cost +
                ", title='" + title + '\'' +
                ", type=" + type +
                ", number='" + number + '\'' +
                '}';
    }

    @Override
    public int compareTo(Car o) {
        return (int)(this.getFuelConsumption() - o.getFuelConsumption());
    }
}
