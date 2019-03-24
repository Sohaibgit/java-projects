package com.telenor.main;

import com.telenor.datasets.Printer;
import com.telenor.threads.MyThread1;
import com.telenor.threads.MyThread2;

public class Main {

	public static void main(String[] args) {
		
		
		
		System.out.println("Application Started");
		Printer printer = new Printer();
		MyThread1 thread = new MyThread1(printer);
		thread.setDaemon(true);
		thread.start();
		
		// we can also set the thread as daemon thread by calling thread.setDaemon(true)
		// and this method must be invoked before the thread is started.
		// daemon thread executes along with the main thread... so when the JVM is gonna start the app it gonna
		// start the main as well as the daemon threads...
	/*	try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} */
		// if we have multiple threads working on the same printer object then instead of calling join()
		// for each thread we can use the keyword synchronized with the printer method printDocuments()
		// or more efficiently we can make a synchronized block inside each thread
		
		// so synchronization is required in multithreading when 2 or multiple threads are working on the
		// same single object...
		
		MyThread2 thread2 = new MyThread2(printer);
		thread2.start();
		System.out.println("Application Finished");
	}

}
