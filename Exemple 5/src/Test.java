
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
		
		
		System.out.println("User:\n");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!\n");
		System.out.println("User Name: " + userName);
		System.out.println("User Type: " + userType);
		System.out.println("Amount bought:" + userBuy);
		System.out.println("Rate:" + userRate);
	
		if (userType.equals("Vip")) {
			System.out.println("\nTicket:");
			System.out.println(userName + ", you're a Vip user.");
			System.out.println("You've paid " + userBuy + "euros");
			System.out.println("You have a 25% discount");
			
			int discount = userBuy * 25 / 100; 
			System.out.println("Your discount is " + discount);
			
			int price = userBuy - discount;
			System.out.println("The final price is " + price + "euros");
		
		} else {
			
		System.out.println("\nTicket");
		System.out.println(userName + ", you're not a Vip user");
		System.out.println("You've paid " + userBuy);
		System.out.println("Your discount is 0%");
		
		}
		
		}

	}
}
	
