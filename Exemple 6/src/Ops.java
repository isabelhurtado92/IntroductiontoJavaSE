import java.util.Scanner;

public class Ops {

public static void purchaseProcess() {
	
	int discount= 0 ;
	int totalDiscount= 0;
	int price = 0;
	
	
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
	
	
	System.out.println("User:");
	System.out.println("!!!!!!!!!!!!!!!!!!!!!!!\n");
	System.out.println("User Name: " + userName);
	System.out.println("User Type: " + userType);
	System.out.println("Amount bought:" + userBuy);
	System.out.println("Rate:" + userRate);
	
	

	if (userType.equals("Vip")) {
		
		discount = 25; 
		totalDiscount = userBuy * 25 / 100;
		price = userBuy - totalDiscount;
		printTicket(userBuy, discount, totalDiscount, price);
		
	
	} else if (userType.equals("Regular")) {
					
		discount = 15;
		totalDiscount = userBuy * 15 / 100;
		price = userBuy - totalDiscount; 
		printTicket(userBuy, discount, totalDiscount, price);
		
	} else if (userType.equals("New")) {
	
		discount = 0 ;
		totalDiscount = userBuy * 0 / 100;
		price = userBuy - totalDiscount;
		printTicket(userBuy, discount, totalDiscount, price);
	
		
	} else {
		System.out.println("Oops, we couldn't process your petition. Please, remember to write Vip/Regular/New with capital letters");
	}
	}
	}
	
	
public static void printTicket(int userBuy, int discount, int totalDiscount, int price) {
	System.out.println("\nYour ticket:");
	System.out.println("!!!!!!!!!!!!!!!!!!!!!\n");
	System.out.println("Your discount is " + discount);
	System.out.println("That is, applied to your purchase " + totalDiscount);
	System.out.println("The final price is " + price);
	System.out.println("The final price with taxes is" + addTax(price));
	}

public static double addTax(int price) {
	double tax = 0.21;
	double purchaseTax = (double) price * tax;
	double finalPrice = price + purchaseTax;
	
	return finalPrice;
	
}

}
