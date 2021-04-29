

import java.util.Scanner;


public class Init {

	public static void main(String[] args) {
//Name Request		
		
	Scanner reader = new Scanner (System.in);
	
	System.out.println("Welcome, type your name and surname in order to create your account: ");
	
	String nameandsurname = reader.nextLine();
	
	System.out.println("Thanks " + nameandsurname);
			
	
	
//Llamadas a clases y sus metodos		
		
		AccountManagement.createAccount (nameandsurname);
		//AccountManagement.deleteAccount;
		//AccountManagement.updateAccount;
		
		//AccountCreation.createUser;
		//AccountCreation.createPassword;
		
		
				
		


	
}

	
}