import java.util.Random;
import java.util.Scanner;

public class Tools {
	
	public static int createIntRandom(int top) {
		
		Random rand = new Random();

		// Generate random integers in range 0 to top, if top=10 random 0 to 9
		int intRandom = rand.nextInt(top);
		return intRandom;

	}

	public static char createCharRandom() {
		
		// Random rand = new Random();
		// String alphabetChars =
		// "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
		// String alphabetChars2 = "!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/";
		String alphabetChars3 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!·$%&/()=?¿?=)()/*-+^*Ç¨_:;;:_+/+/";

		// Generate random char in range 0 to top, if top=10 random 0 to 9

		char charRandom = alphabetChars3.charAt(createIntRandom(alphabetChars3.length()));

		return charRandom;

	}
	
	
	
	public static void print (String wordtoPrint) {
		
		System.out.println(wordtoPrint);
		
	}
	
	public static void print (char chartoPrint) {
		
		System.out.println(chartoPrint);
	}
	
	public static void print (int intoPrint) {
		System.out.println(intoPrint);
	}
	
	

}