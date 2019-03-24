package com.telenor.datasets;

public class Printer {

	synchronized public void printDocuments(int quantity, String docName) {
		// synchronized means whenever thread calls this method it will require a lock(imprinsic lock)
		// and hence no other thread can execute or access it until it has done its complete job
	    // for the current calling thread
		// this should be done when multiple threads are going to call this same single method
		for(int i = 1 ; i <=quantity ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Print Document "+docName+" No#"+i);
		}
	}
}
