package Mastery;

public class Truck extends Vehicle{
	double highway;
	double city;
	int seating;
	double cargo;
	double haulingcapacity;
	
	public Truck(double c, double h, int s, double v, double C) {
		super(c, h, s, v);
		highway = h;
		city = c;
		seating = s;
		cargo = v;
		haulingcapacity = C;
	}
	
	public double getfuelecoCity() {
		return(city);
	}
	
	public double getfuelecoHgwy() {
		return(highway);
	}
	
	public int getseatcapacity() {
		return(seating);
	}
	public double getcargoVolume() {
		return(cargo);
	}
	public double gethaulingcapacity() {
		return(haulingcapacity);
	}

}
