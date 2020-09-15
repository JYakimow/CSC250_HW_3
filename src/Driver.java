//Write a Java program that prompts the user for a decimal number and then displays to the screen the binary equivalent as a String. 
import java.util.Scanner;

public class Driver //initializes Driver class
{
	public static void main(String[] args) //begins main method
	{
		//input value to be checked using scanner class
		Scanner decInput = new Scanner(System.in); //opens the scanner
		Integer startingInt = 0; //create variable to use inputed string after converted to int later
		
		while(true)
		{
			System.out.println("Please enter the number you wish to convert to binary: ");
			String initialString = decInput.nextLine(); //takes value inputed and assigns value to a variable.
			
			try //this code will be executed if possible unless input is not proper type
			{
				startingInt = Integer.parseInt(initialString); //convert the string to an integer to be used later in program
				decInput.close(); //close scanner resource leak
				break;
			}
			catch(Exception a) //if code above fails in line 17-22 this will be executed.
			{
				System.out.println("You must enter a number.");
			}
		} //end while loop
		
		//initialize variables
		
		
		//debug output
		System.out.println(startingInt);
		
		//------------ Keep all main method code above this line ------------
		System.out.println("[End]"); //informs user that the program has ended
	} //ends main method
} //ends driver class