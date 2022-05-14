package encapsulation;

public class car {
	private String make;
	private String model;
	private int year;
	car(String make,String model,int year) {
		this.make = make;
		this.model = model;
		this.year = year;
		// TODO Auto-generated constructor stub
	}
	car(car x){
		this.copy(x);  //this keyword is used to distunguish class variable from parameter
		
	}
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public int getYear() {
		return year;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public void copy(car x) {
		this.setMake(x.make);
		this.setModel(x.model);
		this.setYear(x.year);
	}
	
}
	

