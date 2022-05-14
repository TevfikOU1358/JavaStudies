package multithreading;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread thread1 = new MyThread();   //Method1 
		MyRunnable runnable1 = new MyRunnable(); //Method2
		Thread thread2 = new Thread(runnable1);
		
		//thread1.setPriority(2);
		thread1.start();
		//thread1.join();		Thread1 bitmesini bekler
		//thread1.join(300);		Thread1 300 ms bitmesini bekler
		thread2.start();
		System.out.println(1/0);  //error main thread but other threads will continue daemon threadlar çalýþmaz
	}

}
