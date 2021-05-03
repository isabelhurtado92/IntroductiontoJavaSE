package words5;

import java.util.Scanner;

public class AccountUpdating {
	
	
	public static String updateAccount (Scanner reader, String user, String password) {
		
		System.out.println("¿Are you sure you want to change your password?");
		String inputSure = reader.nextLine();
		
		
		if (inputSure.equals("Yes")) {
			
			System.out.println("Please, introduce your former password");
			String inputFormerPass = reader.nextLine();
			
			if (inputFormerPass.equals(password)) {
				
				System.out.println("Please, introduce your new password");
				String inputNewPass = reader.nextLine();
				
			}
			
			
			
		} else  {
			
			System.out.println("Bye");
			
		}
		
	}

	return inputNewPass;
}
