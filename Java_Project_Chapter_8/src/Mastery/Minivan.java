package Mastery;

public class Minivan extends Vehicle{
	double highway;
	double city;
	int seating;
	double cargo;
	int numberofdoors;
	
	public Minivan(double c, double h, int s, double v, int d) {
		super(c, h, s, v);
		highway = h;
		city = c;
		seating = s;
		cargo = v;
		numberofdoors = d;
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
	public int getdoors() {
		return(numberofdoors);
	}

}
