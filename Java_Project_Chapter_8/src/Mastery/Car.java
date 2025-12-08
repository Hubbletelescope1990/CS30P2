package Mastery;

public class Car extends Vehicle{
	double highway;
	double city;
	int seating;
	double cargo;
	double topspeed;
	
	public Car(double c, double h, int s, double v, double S) {
		super(c, h, s, v);
		highway = h;
		city = c;
		seating = s;
		cargo = v;
		topspeed = S;
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
	public double gettopspeed() {
		return(topspeed);
	}
}
