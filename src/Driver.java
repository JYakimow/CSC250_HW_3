//Write a Java program that prompts the user for a decimal number and then displays to the screen the binary equivalent as a String. 
import java.util.Scanner;

public class Driver //initializes Driver class
{
	public static void main(String[] args) //begins main method
	{
		//input value to be checked using scanner class
		Scanner decInput = new Scanner(System.in); //opens the scanner
		Integer userInput = 0; //create variable to use inputed string after converted to an integer later
		
		while(true)
		{
			System.out.println("Please enter the number you wish to convert to binary: ");
			String initialString = decInput.nextLine(); //takes value inputed and assigns value to a variable.
			
			try //this code will be executed if possible unless input is not proper type
			{
				userInput = Integer.parseInt(initialString); //convert the string to an integer to be used later in program
				decInput.close(); //close scanner resource leak
				break;
			}
			catch(Exception a) //if code above fails in line 17-22 this will be executed. Designed to catch improper user-input error.
			{
				System.out.println("You must enter a number.");
			}
		} //end while loop
		
		//execute logic to determine binary equivalent
		System.out.print("The binary equivalent of the inputed number is: ");
		System.out.println(convertToBinary(userInput));
		
		//debug output
		//System.out.println(userInput);
		
		//------------ Keep all main method code above this line ------------
		//System.out.println("[End]"); //informs user that the program has ended
	} //ends main method
	
	static String convertToBinary(Integer startInt) 
	{
		//define local variables
		Integer start = startInt;
		Integer currentNum = 0;
		Integer remainder = 0;
		String binary = "";
		
		//logic to calculate binary equivalent
		currentNum = start; //assign starting value to currentNum variable
		while(true)
		{
			remainder = currentNum % 2; //get remainder of modulo division of currentNum by 2 (repeat till number cannot be divided further)
			binary = remainder + binary; //creating binary string using the output remainders
			currentNum = currentNum / 2; //divide currentNum by 2 to adjust future modulo division to get remainders
			if(currentNum == 0) { //check if number can still be divided any further
				break; //break while loop
			}
		}//end while loop
		return binary; //return binary string
	}//end convertToBinary function
	
} //ends driver class