import java.util.ArrayList;

public class Main {
    public static ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Car car = new Car("VW", "polo", 2004, 120, 50);
        System.out.println("Car calcualte efficiency "+car.calculateFuelEfficiency());
        Truck truck = new Truck("fe", "g5", 2015, 500, 98, 131);
        System.out.println("Truck calculate efficiency "+truck.calculateFuelEfficiency());
        Car car2 = new Car("ferrari", "y", 2024, 0, 0);
        System.out.println(car2.calculateFuelEfficiency());
        System.out.println(vehicles);
    }
}