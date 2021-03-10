//********************************************************************
// Author: W. Savitch (modified by N. Acemian)
//
//  This program demonstrates how to read String tokens with
//  the Scanner class
//********************************************************************

import java.util.Scanner;

public class ScannerDemo3
{
	public static void main(String[] args)
	{
		//Let's declare our Scanner object
		Scanner scannerObject = new Scanner(System.in);

		// let's try to read 2 "words" now
		System.out.println("Next enter two words:");

		String word1 = scannerObject.next( );
		String word2 = scannerObject.next( );
		System.out.println("You entered \"" + 
				word1 + "\" and \"" + word2 + "\"");

		String junk = scannerObject.nextLine( ); //To get rid of '\n'

		// let's try to read an entire line
		System.out.println("Next enter a line of text:");
		String line = scannerObject.nextLine( );
		System.out.println("You entered: \"" + line + "\"");

		//Close the Scanner Object
		scannerObject.close();
	} // end of main()
} // end of class ScannerDemo3
