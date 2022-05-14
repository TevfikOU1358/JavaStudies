package audio;
import javax.sound.sampled.*;

import java.awt.CardLayout;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
		 public static void main(String[] args)
		  {
			 
		    File sound = new File("src/tefo.wav");

		    PlaySound(sound);

		  }

		  static void PlaySound(File Sound)
		  {
		    try{
		      Clip clip = AudioSystem.getClip();
		      clip.open(AudioSystem.getAudioInputStream(Sound));
		      Scanner scanner = new Scanner(System.in);
		      String response ="";
		      while(!response.equals("Q"))
		    	  {
		    	  	System.out.println("P = Play, S = Stop, R = Reset, Q = Quit");
		    	  	System.out.println("Enter your choice:");
		    	  	response = scanner.next();
		    	  	response =response.toUpperCase();
		    	  	switch (response) {
					case ("P"): clip.start();
					break;
					case ("S"): clip.stop();
					break;
					case ("R"): clip.setMicrosecondPosition(0);
					break;
					case ("Q"): clip.close();
					break;
					default:
					System.out.println("not valid response");	
						throw new IllegalArgumentException("Unexpected value: " + response);
					}
		    	  }
		      clip.start();
		      clip.close();

		      Thread.sleep(clip.getMicrosecondLength()/1000);
		    }catch(Exception e)
		    {
		    		e.printStackTrace();
		    }
		  }
}
