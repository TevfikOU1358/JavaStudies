package oop;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar1 = new Car();
		Car myCar2 = new Car("BMW", "5.20" , 2021);
		Car myCar3 = new Car("Peugeout", "508", 2015);

		myCar1.drive();
		myCar1.make ="Toyota";  //only changed MyCar1 objects make value
		myCar1.drive();
		myCar2.drive();
		myCar3.drive();
		
		
		String year = ((Object)myCar3.year).toString();  //Int to String
		int season = Integer.parseInt(year);			 //String to Int
		System.out.println("year:"+year);
		System.out.println("year:"+season);
	}

}
