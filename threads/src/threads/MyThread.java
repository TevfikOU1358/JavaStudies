package threads;

public class MyThread extends Thread{
	@Override	
	public void run() {
		if(this.isDaemon())
			System.out.println("thread2 is daemon thread that is running");
		else	
			System.out.println("thread2 is a user thread running");

			
	}

}
