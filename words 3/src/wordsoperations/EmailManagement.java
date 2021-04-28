package wordsoperations;

import java.util.Random;
import java.util.Scanner;

public class EmailManagement {
	
	// -------------------------------------------------------
		// -----------------  Main METHOD--------------
		// ----------------------------------------------
	

	public static void createAccount(String word) {

		String user = createUser(word);
		// String email = createEmail(word);
		// String password = createPassword(word);

	}
	
	// -------------------------------------------------------
	// ----------------- utilitats de impressio---------------
	// ----------------------------------------------
	
	

	public static String createUser(String word) {

		// agafa'm word i talla-me'l, només volem el nom de la persona

		
		int index = word.indexOf(" ");
		String username = (word.substring( 0, (index)));
		print("Username is: " + username);

		return word;

	}

	public static String createEmail(String word, int index) {
	
		
		char firstchar = word.charAt(0);
		print(firstchar);
		
		String surname = (word.substring((index), word.length()));
		print(surname);
		
		
		
		String domain = @java.com;
		
		//string email = firstchar + surname + domain
		//print(" Email is: ");
		
		return word;
	}

	public static String createPassword() {
		// to-do
		String password = "";
		return password;
	}

	public static void printUserAccount() {
		// to-do
	}

	public static int createIntRandom(int top) {

		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		return rand.nextInt(top);

	}

	public static char createCharRandom() {

		Random rand = new Random();
		String alphabetChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars.charAt(createIntRandom(alphabetChars.length()));

		return charRandom;

	}

	// -------------------------------------------------------
	// ----------------- utilitats de impressio---------------
	// ----------------------------------------------

	public static void print(String wordtoPrint) {
		// scope #3
		System.out.print(wordtoPrint);
	}

	public static void print(char chartoPrint) {
		// scope #4
		System.out.print(chartoPrint);
	}

	public static void print(int intToPrint) {
		// scope #3
		System.out.print(intToPrint);
	}

	public static void linebreak() {
		// scope #5
		System.out.print("\n");
	}

	// ----------------------------------------------------------------
	// ---------------- test -------------------------------------------
	// -----------------------------------------------------------------

	public static void testRandom() {

		String password = "_";

		int count = 0;
		while (count < 5) {
			int i = createIntRandom(10000);
			char j = createCharRandom();

			password = password + i + j;

			System.out.println(password);
			count++;

		}

		System.out.println(createIntRandom(1500));
		System.out.println(createCharRandom());
		System.out.println(createIntRandom(200));
		System.out.println(createCharRandom());

	}

}
