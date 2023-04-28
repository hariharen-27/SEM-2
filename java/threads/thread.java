package threads;
// class SampleThread extends Thread{
	
// 	public void run() {
// 		System.out.println("Thread is under Running...");
// 		for(int i= 1; i<=10; i++) {
// 			System.out.println("i = " + i);
// 		}
// 	}	
// }

// public class thread {

// 	public static void main(String[] args) {
// 		SampleThread t1 = new SampleThread();
// 		System.out.println("Thread about to start...");
// 		t1.start();
// 	}
// }

class SampleThread implements Runnable{
	
	public void run() {
		System.out.println("Thread is under Running...");
		for(int i= 1; i<=10; i++) {
			System.out.println("i = " + i);
		}
	}	
}

public class thread {

	public static void main(String[] args) {
		SampleThread threadObject = new SampleThread();
		Thread thread = new Thread(threadObject);
		System.out.println("Thread about to start...");
		thread.start();
	}
}

//  class thread extends Thread {  
//     // run() method to perform action for thread.   
//     public void run()  
//     {    
//        int a= 10;  
//        int b=12;  
//        int result = a+b;  
//        System.out.println("Thread started running..");  
//        System.out.println("Sum of two numbers is: "+ result);  
//     }  
//     public static void main( String args[] )  
//     {  
//      // Creating instance of the class extend Thread class  
//        thread t1 = new  thread();  
//        //calling start method to execute the run() method of the Thread class  
//        t1.start();  
//     }  
// }  
