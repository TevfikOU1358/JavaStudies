import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.14;
		double y = 10;
		
		double z = Math.max(x, y);
		double t = Math.min(x, y);
		double k = Math.sqrt(y);
		double l = Math.floor(x);
				
		System.out.println("Max:"+z);
		System.out.println("Min:"+t);
		System.out.println("Sqrt:"+k);
		System.out.println("Floor:"+l);
		
		Scanner scanner = new Scanner(System.in);
		/*
		 * Generate random values in different types
		 */
		Random random = new Random();
		
		int a     = random.nextInt(9999);
		double b  = random.nextDouble(1000);
		boolean c = random.nextBoolean();
		System.out.println("rand: "+a);
		System.out.println("rand: "+b);	
		System.out.println("rand: "+c);
		
	}

}
