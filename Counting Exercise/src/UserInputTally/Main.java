package UserInputTally;

import java.util.Scanner; //because using scanner...need to import.

public class Main {

	public static void main(String[] args) {
	    int sum = 0; //start the sum process at zero.
	   // int difference = 0;
	   // int product = 0;
	   // int quot = 0;
	    System.out.println("Enter numbers here:"); //adds a placeholder to show user what to do.
	    Scanner addIn = new Scanner((new Scanner(System.in)).nextLine()); //allows user to add multiple numbers. 
	    //Scanner is used to read input from various inputs like keyboard,network,etc. 
	    //Scanner class is used to read input from keyboard in Java. "system..in" is InputStream which is typically connected to keyboard input of console program.
	   // Scanner subtractIn = new Scanner((new Scanner(System.in)).nextLine());
	    
	    while (addIn.hasNextInt()) { //A while loop statement repeatedly executes a target statement as long as a given condition is true.
	    	//when next number is added, record it.
	    	sum += addIn.nextInt(); //take above number and add it to previous number(s).
    	//while (subtractIn.hasNextInt()){
	       // difference -= addIn.nextInt();
	       // product *= addIn.nextInt();
	       // quot /= addIn.nextInt();
	        }
	    System.out.println("Your total is: " + sum);//print out the new sum of all numbers added.
	}
}
//}