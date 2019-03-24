package com.telenor.threads;

import com.telenor.datasets.Printer;

public class MyThread2 extends Thread{
	
	Printer printer;
	
	public MyThread2(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		printer.printDocuments(10, "JoiningForm.pdf");	
	}
	
}