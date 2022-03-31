package com.lockedme;
import java.io.File;
import java.util.Scanner;
public class FileSearch {
	public static void searchAFile() {
		Scanner sc = new Scanner(System.in); //creating scanner object
		File Locker = new File("Locker");
		System.out.print("Enter the filename to search with the extensions, Case Sensitivity is there: ");
		String ele = sc.next(); // takes the filename to search
		String[] fileList = Locker.list(); //creates a list of filenames in the directory
	        if (fileList==null) {
	            System.out.println(" *There is no file present in Directory.* ");
	            return;
	        }
	        int count=0;
	        boolean flag = false;
	        for(String s : fileList) { 
	        	if(s.equals(ele)) { //if input filename matches with the filename in the list it prints it position
	        		System.out.println(ele+" is found at "+(count+1)+" position.");
	        		flag=true;
	        	}
	        	count++;
	        }
	        if(flag==false) { // if no file mathes with the input then it prints file is not present.
	        	System.out.println(ele+" is not present");
	        }
		
	}
}
