
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		while (true) {
		Scanner reader = new Scanner (System.in);
		System.out.println("Please, tell us your name:");
		String userName = reader.nextLine();
		
		System.out.println("Now please, tell us your type of user:");
		String userType = reader.nextLine();
		
		System.out.println("Last but not least, tell us the amount of your buy:");
		int userBuy = reader.nextInt();
		
		
		System.out.println("From 0 to 10, how would you rate our service?");
		double userRate = reader.nextDouble();
		
		
		int discount= 0 ;
		int price = 0;
		
		System.out.println("User:");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!\n");
		System.out.println("User Name: " + userName);
		System.out.println("User Type: " + userType);
		System.out.println("Amount bought:" + userBuy);
		System.out.println("Rate:" + userRate);
		
		
	
		if (userType.equals("Vip")) {
			System.out.println("\nTicket:");
			System.out.println("You've paid " + userBuy);
			System.out.println("You have a 25% discount");
			
			discount = userBuy * 25 / 100; 
			price = userBuy - discount; 
			System.out.println("Your discount is " + discount);
			System.out.println("The final price is " + price);
			
			
			
		
		} else if (userType.equals("Regular")) {
			System.out.println("Ticket:");
			System.out.println("You've paid " + userBuy);
			System.out.println(userName + ", you're a Regular user");
			System.out.println("You have a 15% discount");
			
			discount = userBuy * 15 / 100;
			price = userBuy - discount; 
			System.out.println("Your discount is " + discount);
			System.out.println("The final price is: " + price);
			
			
			
			
		} else if (userType.equals("New")) {
		System.out.println(userName + ", you're a New user");
		System.out.println("You have a 0% discount");
		
		discount = userBuy * 0 / 100;
		price = userBuy - discount;
		System.out.println("Your discount is " + discount);
		System.out.println("The final price is: " + price); 
		
		}
	
		else {
			System.out.println("Oops, we couldn't process your petition. Please, remember to write Vip/Regular/New with capital letters");
		}
	}
	}
}
	