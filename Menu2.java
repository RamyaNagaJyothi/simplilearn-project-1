package com.lockedme;

public class Menu2 {
	public static void secondaryMenu() {
		boolean status = true;
		while(status==true) { // runs until user wants to go the primary menu.
			System.out.println();
			System.out.println("   ***SECONDARY MENU***   ");
			System.out.println();
			System.out.println("1. Add a file ");
			System.out.println("2. Delete a file");
			System.out.println("3. Search a file");
			System.out.println("4. Go to the Previous Menu");
			System.out.println();
			System.out.print("Enter your value (1|2|3|4) : ");
			System.out.println();
			
				switch(Input.input(4)) {
				case 1: FileAddition.additionOfFile();
						break;
				case 2: FileDeletion.deletionOfFile();
						break;
				case 3: FileSearch.searchAFile();
						break;
				case 4: return;
				default:System.out.println("   ***Enter number in the range 1 to 4 only***   ");  
				}
			
			}
	}
}



