package Puck;

public class Puck_Part1 extends Disk 
{
	
	private double weight;
	private boolean standard;
	private boolean youth;
//Creates a puck with set radius, thickness, weight, and if it's standard or youth
	public Puck_Part1(double r, double t, double w, boolean s, boolean y) {
		super(r, t);
		weight = w;
		standard = s;
		youth = y;
	}
	
	public double getWeight() 
	{
		return(weight);
	}
	public String getDivision() 
	{
		if(standard == false && youth == true) {
			return("Puck is for the youth division");
		} else if (standard == true && youth == false) {
			return("Puck is for the standard division");
		} else {
			return("Error");
		}
	}
	
	
	

}

