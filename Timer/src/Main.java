import java.time.Month;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	public static void main(String[] args) {
		/*
		 * Timer: A facility for threads to schedule task for future execution in a background thread
		 * TimerTask: A task that can be scheduled for one time or repeated execution
		 * 
		 */
		Timer timer = new Timer();
		TimerTask task = new TimerTask() {
			int counter = 10;
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println();
				if(counter > 0)
				{
					System.out.println("Counter:"+counter);
					counter--;
				}
				else
				{
					timer.cancel();
					System.out.println("Happy new year:)");	
				}
				
			}
		};
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2022);
		date.set(Calendar.MONTH, Calendar.MAY);
		date.set(Calendar.DAY_OF_MONTH, 7);
		date.set(Calendar.HOUR_OF_DAY, 15);
		date.set(Calendar.MINUTE, 0);
		date.set(Calendar.SECOND, 0);
		date.set(Calendar.MILLISECOND, 0);
		
		//timer.schedule(task, 0);  //2.arg msec
		//timer.schedule(task, date.getTime());
		//timer.scheduleAtFixedRate(task, 0, 1000); //every one sec
		
	}
}
