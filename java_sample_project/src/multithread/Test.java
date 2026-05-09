package multithread;

public class Test extends Thread {
		public void run()
		{
			for (int i = 1; i <= 3; i++) {
	            System.out.println(Thread.currentThread().getName()+"= " + i);
	            Thread.yield();
	        }
		}
	 
		public static void main(String[] args) {
			Test t0=new Test();
			t0.start();
			t0.yield();
			Test t1=new Test();
			t1.start();
			
//			  Thread t1 = new Thread(() -> {
//		            for (int i = 1; i <= 3; i++) {
//		                System.out.println("Thread 1: " + i);
//		               
//		            }
//		        });
//		        Thread t2 = new Thread(() -> {
//		            for (int i = 1; i <= 3; i++)
//		                System.out.println("Thread 2: " + i);
//		            Thread.yield();
//		        });
//		        t1.start();
//		        t2.start();
		//When a thread calls yield(), it is telling the CPU:
	 
	//"I have a lot of work to do, but I'm not in a hurry. "
		        //"//If there are other threads waiting for a turn, I’m okay with "
	// "//stepping back to the end of the line so they can run for a bit."        
	 
		}

}
