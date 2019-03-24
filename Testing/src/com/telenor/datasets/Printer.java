package com.telenor.datasets;

public class Printer {

	public void printDocuments(int quantity, String docName) {
		for(int i = 1 ; i <=quantity ; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("#"+i+": Printing Document "+docName);
		}
	}
}
