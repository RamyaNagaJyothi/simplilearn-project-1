package com.lockedme;
import java.util.Scanner;
public class Input {
	public static int input(int optionRange) { // It takes the optionRange input, to ask the user to input the values in that range only.
		Scanner sc = new Scanner(System.in); //creating scanner object
		boolean intnotfound=true ;
        int checkint =0;
        while(intnotfound) // While block will executes until we get integer input.
        {
            try
            {
                String s = sc.next(); // takes input as string
                checkint = Integer.parseInt(s); //convert string into integer datatype and throws exception if conversion not possible.
                intnotfound = false;


            }
            catch(Exception ex)
            {  // control comes to catch block if input is not an integer.
                checkint = 0;
                System.out.println("\n->Alphabet, Special Characters, Words are not allowed.\n");
                System.out.print("Enter only numeric values in the range 1 to "+optionRange+": ");
            }
        }
      
        return checkint; //returns the integer which we take from input
		
	}
}
