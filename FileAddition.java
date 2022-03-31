package com.lockedme;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.util.Scanner;

public class FileAddition {
	public static void additionOfFile() {
		Scanner sc = new Scanner(System.in);
		File Locker =  new File("Locker");
		System.out.print("Enter the name of the file to be added with the extension: ");
		File filename = new File(Locker,sc.next());
		try {
              boolean result = filename.createNewFile();
              if(result==true)
            	  System.out.println(filename.getName()+" file is created succesfully.");
              else
            	  System.out.println("File already exist at location: "+filename.getCanonicalPath());
        } catch (FileAlreadyExistsException e) {
            System.err.println("already exists: " + e.getMessage());
        }catch(IOException e) {
        	System.out.println("Addition of "+filename.getName()+" to the Locker directory is failed");
        }
	}	
}
