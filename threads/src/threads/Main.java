package threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.out.println(Thread.activeCount());
		//Thread.currentThread().setName("Main");
		/*System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(4);
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().isAlive());
		for(int i =3; i>0; i--)
		{
			System.out.println(i);
			Thread.sleep(1000);
		}
	*/
		MyThread thread2  = new MyThread();
		System.out.println(thread2.isAlive());
		thread2.setDaemon(true);		//Daemon thread is low priority+
		thread2.start();
		System.out.println(thread2.isAlive());
		thread2.setName("Thread1");
		System.out.println(thread2.getName());
		System.out.println(Thread.activeCount());

		//thread2.stop();
		//System.out.println(thread2.isAlive());	
	}

}
