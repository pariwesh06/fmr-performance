package net.sdo.stock;

import java.util.ArrayList;
import java.util.List;

public class GarbageCollectionAnalysisExample {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		for (int i = 0; i < 100000000; i++) {
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			l = new ArrayList<String>(); // Memory leak
			System.out.println(l);
		}
		System.out.println("Done");
	}
}