package words;

import java.util.Scanner;

public class Init {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner (System.in);
		System.out.println("Write some string...");
		String word = reader.nextLine();
		
		
		Operations.print(word);
		Operations.linebreak();
		Operations.printString(word);
		Operations.printStringH(word);
		Operations.printStringV(word);
		//Operations.printStringHG(word);
		
		
		
		System.out.println("Chau");
		

	}

}
