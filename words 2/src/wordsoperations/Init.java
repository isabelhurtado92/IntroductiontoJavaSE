package wordsoperations;

	import java.util.Scanner;

	public class Init {
		// scope #1
		public static void main(String[] args) {

			// scope #2
			Scanner reader = new Scanner(System.in);
			System.out.println("Write any string ...");
			String word = reader.nextLine();

			//Operations.operationsString(word);
			//Editing.subEditing (word);
			EmailManagement.createAccount(word);
			
			System.out.println("\nBye bye my friend...");

		}	
	
	
}
