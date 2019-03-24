package com.telenor.threads;

import com.telenor.datasets.Printer;

public class Thread1 extends Thread{

	Printer printer;
	
	public Thread1(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		synchronized(printer) {
			printer.printDocuments(10, "Thread1Docoment.pdf");
		}
	}
	
	
}
