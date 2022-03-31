package com.lockedme;

public class Menu1 {
	public static void primaryMenu() {
		boolean status=true;
		while(status==true) { // while block runs until user wants to close the application.
			
			System.out.println();
			System.out.println("   ***PRIMARY MENU***   ");
			System.out.println();
			System.out.println("1. Display all the files in the folder in the Ascending order");
			System.out.println("2. Perform file operations");
			System.out.println("3. Exit from the application");
			System.out.println();
			System.out.print("Enter your value(1|2|3) : ");
				switch(Input.input(3)) {
				case 1: Display.displayAllFiles();
						break;
				case 2: Menu2.secondaryMenu();
						break;
				case 3: status=false;
					   System.out.println("The application is closed successfully");
					   break;
			    default:System.out.println("   ***Enter number in the range 1 to 3 only***   ");
			   }	
		}
	}
}
