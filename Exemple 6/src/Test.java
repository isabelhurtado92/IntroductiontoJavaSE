
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
		System.out.println("Please, tell us your name:");
		String userName = reader.nextLine();
		
		System.out.println("Now please, tell us your type of user:");
		String userType = reader.nextLine();
		
		System.out.println("Last but not least, tell us the amount of your buy:");
		int userBuy = reader.nextInt();
		
		
		System.out.println("From 0 to 10, how would you rate our service?");
		double userRate = reader.nextDouble();
		
		
		System.out.println("User:");
		System.out.println("!!!!!!!!!!!!!!!!!!!!!!!\n");
		System.out.println("User Name: " + userName);
		System.out.println("User Type: " + userType);
		System.out.println("Amount bought:" + userBuy);
		System.out.println("Rate:" + userRate);
		
		
	
		if (userType.equals("Vip")) {
			System.out.println("Ticket:");
			System.out.println("You've paid " + userBuy);
			System.out.println("You have a 25% discount");
			
			int discountvip = userBuy * 25 / 100; 
			int pricevip= userBuy - discountvip; 
			System.out.println("Your discount is " + discountvip);
			System.out.println("The final price is " + pricevip);
			
			
			
		
		} else if (userType.equals("Regular")) {
			System.out.println("Ticket:");
			System.out.println("You've paid " + userBuy);
			System.out.println(userName + ", you're a Regular user");
			System.out.println("You have a 15% discount");
			
			int discountreg = userBuy * 15 / 100;
			int pricereg= userBuy - discountreg; 
			System.out.println("Your discount is " + discountreg);
			System.out.println("The final price is: " + pricereg);
			
			
			
			
		} else if (userType.equals("New")) {
		System.out.println(userName + ", you're a New user");
		System.out.println("You have a 0% discount");
		
		int discountnew = userBuy * 0 / 100;
		int pricenew= userBuy - discountnew;
		System.out.println("Your discount is " + discountnew);
		System.out.println("The final price is: " + pricenew); 
		
		}
	

	}
	
}
	
