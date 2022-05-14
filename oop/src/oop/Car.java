package oop;

public class Car {
	/*
	 * Constructor: Called when created new object that class
	 * it can be used assigment their values
	 */
	Car()   //Default Constructor
	{
		System.out.println("Default Constructor");
	}
	Car(String make, String model, int year)  //Overload Construxtor
	{
		this.make = make;
		this.model = model;
		this.year = year;
		System.out.println("Overload Constructor");
	}
	//~Car(){
	//System.out.println("Destructor");
	//}
	String make ;
	String model ;
	int year ;
	
	void drive() {
		System.out.println("make:"+make+" model:"+model+" year:"+year);
	}
	
}
