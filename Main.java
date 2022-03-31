package com.lockedme;
import java.io.File;
public class Main {

	public static void main(String[] args) {
		//creating a Locker directory to store all the files
		File Locker =  new File("Locker");
		if(Locker.exists()==false) {
			Locker.mkdir();
		}
		WelcomeScreen.display();
		Menu1.primaryMenu();
		
		
	}

}
