public class Truck extends Vehicle{
    private double cargoWeight;

    public Truck(String make, String model, int year, double milesDriven,double fuelConsumed,double cargoWeight) {
        super(make, model, year, fuelConsumed, cargoWeight);
        this.cargoWeight=cargoWeight;
        this.make = make;
        this.model = model;
        this.year = year;
        this.milesDriven=milesDriven;
        this.fuelConsumed=fuelConsumed;
    }
    @Override
    public double calculateFuelEfficiency(){
        return fuelConsumed / (milesDriven + (cargoWeight * 0.5));
    }
}