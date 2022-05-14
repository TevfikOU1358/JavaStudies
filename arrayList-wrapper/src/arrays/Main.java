package arrays;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String name = "tefoli13";
		//boolean result = name.equals("tefoli13");
		//int result = name.length();
		//char result = name.charAt(0);
		//int result = name.indexOf('i');
		//boolean result = name.isEmpty();
		//String result = name.toUpperCase();
		//String result = name.trim();   //remove empty space
		//String result = name.replace('o', 'a');
		//System.out.println(result);
		
		/***
		 * Wrapper class: provide a ways to use primitive data types as reference data types
		 * reference data types contain useful methods
		 * autoboxing:automatic conversion that the java compiler makes between the primitive types and their corresponding object wrapper class
		 * unboxing:reverse autoboxing referece to primitive
		 * primitive              wrapper
		 * ---------              ------
		 * boolean                Boolean
		 * char                   Character
		 * int					  Integer 
		 * double				  double
		 * There are two types of variables in Java, primitive and reference type. All the basic types e.g. int, boolean, char, short, float, long and double are known as primitive types. JVM treats them differently than reference types, which is used to point objects e.g. String, Thread, File, and others. Reference variables are not pointers but a handle to the object which is created in heap memory.
		 *  The main difference between primitive and reference type is that primitive type always has a value, 
		 * it can never be null but reference type can be null, which denotes the absence of value. So 
		 *if you create a primitive variable of type int and forget to initialize it then it's value would be 0, the default value of integral type in Java, 
		 * but a reference variable by default has a null value, which means no reference is assigned to it.
		 */
		/*
		 * 
		 * ArrayList = a resizable array
		 * Elements can be added and removed after compilation phase store reference data types 
		 */
		
		ArrayList<String> food = new ArrayList<String>();
		food.add("pizza");
		food.add("hamburger");
		food.add("hotdog");
		
		food.set(2, "melemen");
		food.remove(1);
		//food.clear();
		for(int i = 0; i< food.size();i++)
			System.out.println(food.get(i));
		
		String[] animals = {"cat","dog","rat","bird"};
		for(String i : animals)
			System.out.println(i);
 	}

}
