package com.telenor.threads;

import com.telenor.datasets.Printer;

public class MyThread1 extends Thread{
	
	Printer printer;
	
	public MyThread1(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		synchronized(printer) {
		// synchronized block means no other thread can access this printer object until this block
		// finish its execution...
		printer.printDocuments(10, "CodeOfConduct.pdf");	
		}
	}
	
}
