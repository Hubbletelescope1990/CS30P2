package Mastery;

public abstract class Vehicle {
	public double fuelEconomyCity;
	public double fuelEconomyHgwy;
	public int seatingCapacity;
	public double cargoVolume;
	
	public Vehicle(double c, double h, int s, double v) {
		fuelEconomyCity = c;
		fuelEconomyHgwy = h;
		seatingCapacity = s;
		cargoVolume = v;
	}
	
	public abstract double getfuelecoCity();
	public abstract double getfuelecoHgwy();
	public abstract int getseatcapacity();
	public abstract double getcargoVolume();
}
