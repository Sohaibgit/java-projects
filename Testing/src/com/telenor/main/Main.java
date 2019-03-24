package com.telenor.main;

import com.telenor.datasets.Printer;
import com.telenor.threads.Thread1;
import com.telenor.threads.Thread2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Application Started");
		Printer printer = new Printer();
		Thread1 thread1 = new Thread1(printer);
		thread1.start();
		
		
		Thread2 thread2 = new Thread2(printer);
		thread2.start();
		System.out.println("Application Finished");
		
		
	}

}
