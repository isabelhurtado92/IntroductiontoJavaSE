package words5;

import java.util.Scanner;

public class Login {
	
	//create method validateAccount (reader, user, password); create RETURN (at the end of the method)
	//ask for user and password, using sout
	//create variable boolean isValidated (= false)
	//create while, placing counter first. (int count = 0)
	//Create 2 input variables using reader (to storage what we're asking for)
	//Compare inputs to user and password, through if and if else
	//create a break, so we can stop the loop
	//if false, sout message "Accound blocked".
	
	
	public static Boolean validateAccount (Scanner reader , String user , String password) {
	
	System.out.println("Please, introduce your user and password to log in");	
	
	int count = 0;
	boolean  isValidated = false;
	
	while (count < 5) {
		
		String userInput = reader.nextLine();
		String passwordInput =	reader.nextLine();	
		
		if (userInput.equals(user) && passwordInput.equals(password)) {
		System.out.println("Your login was successfull!");	
		
		} else {
		System.out.println("Please try again");
		}
		
	}
		
	count ++;
	
while (count > 5) {
		System.out.println("Ooops, sorry, we've temporarily blocked your account for security reasons.");
		break;
		}
		

	return isValidated;	
		
	}
	
}
