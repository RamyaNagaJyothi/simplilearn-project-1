package com.lockedme;
import java.util.Scanner;
import java.io.File;

public class FileDeletion {
	public static void deletionOfFile() {
		File Locker = new File("Locker");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the filename to deleted with the extensions, Case Sensitivity is there: ");
	    String s = sc.next();
		String str = Locker.getAbsolutePath()+"\\"+s;
		File f= new File(str);  
		if(f.exists()==true) { // if file exists then it tries to delete
		try {
			if(f.delete())   // deletes the file and return true if operation is successfull.                
			{  
				System.out.println(f.getName()+" file is deleted");   
				return;
			}  
			else  
			{	  
				System.out.println(f.getName()+" named file does not exists");  
				return;
			}  
		}  
		catch(Exception e)  
		{  
			e.printStackTrace();  
			return;
		}  
		}else {
			System.out.println(f.getName()+" named file does not exists");  
		}
	
	}
}

