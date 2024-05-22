abstract class Vehicle {
    double milesDriven;
    double fuelConsumed;
    String make;
    String model;
    int year;

    public Vehicle(String make, String model, int year, double milesDriven,double fuelConsumed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.milesDriven=milesDriven;
        this.fuelConsumed=fuelConsumed;
    }
    abstract double calculateFuelEfficiency();
}