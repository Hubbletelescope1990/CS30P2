package Mastery;

public class Staff extends Faculty {
	public String jobtitle;
	
	public Staff (String n, String d, double s, String j) {
		super(d, s, n);
		jobtitle = j;
	}
	
	public String getJob() {
		return(jobtitle);
	}
}
