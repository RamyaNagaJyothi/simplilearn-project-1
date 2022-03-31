package com.lockedme;
import java.util.ArrayList;
import java.util.Collections;
import java.io.File;


public class Display {
	public static void displayAllFiles() {
		File Locker =  new File("Locker");
		ArrayList<String> listOfNames = new ArrayList<>();
		for(File file : Locker.listFiles()) {
			listOfNames.add(file.getName());
		}
		Collections.sort(listOfNames,String.CASE_INSENSITIVE_ORDER);
		System.out.println("Displaying files in the Ascending order by ignoring Case sensitivity:");
		int i = 1;
		for(String s : listOfNames) {
			System.out.println("("+i+") "+s);
			i++;
		}
		
		
	}

}
