package co.grandcircus.lab11;

public class UsedCar extends Car {
	private double mileage;

	public UsedCar(String make, String model, int year, double price, double mileage) {

		super(make, model, year, price);
	}

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
//		return String.format("%-10s %-10s %d\t$%,10.2f", getMake(), getModel(), getYear(),
//				getPrice(), getMileage());
		String usedCar = String.format( "%-10s %-10s %d\t$%,10.2f (used) %-10smiles", getMake() , getModel(), getYear() , getPrice() , mileage, "\n");
        return usedCar;
    }
	}

	

