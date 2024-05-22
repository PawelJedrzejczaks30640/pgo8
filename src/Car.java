public class Car extends Vehicle {
    double milesDriven;
    double fuelConsumed;

    public Car(String make, String model, int year, double milesDriven,double fuelConsumed ) {
        super(make, model, year,milesDriven,fuelConsumed);
        this.make = make;
        this.model = model;
        this.year = year;
        this.milesDriven=milesDriven;
        this.fuelConsumed=fuelConsumed;
    }

    public double calculateFuelEfficiency(){
        return milesDriven/fuelConsumed;
    }
}
