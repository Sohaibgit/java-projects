package com.telenor.threads;

import com.telenor.datasets.Printer;

public class Thread2 extends Thread{

	Printer printer;
	
	public Thread2(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		synchronized(printer) {
			printer.printDocuments(10, "Thread2Docoment.pdf");
		}
	}
	
	
}
