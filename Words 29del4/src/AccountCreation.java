
public class AccountCreation {

	public static String createUser(String nameandsurname) {

		int index = nameandsurname.indexOf(" ");
		String username = (nameandsurname.substring(0, (index)));
		Tools.print("Your username is: " + username);

		return username;

	}

	public static String createPassword() {
		String password = "";
		
		int count = 0;
		while (count < 1) {
			int i = Tools.createIntRandom(1000);
			char j = Tools.createCharRandom();
			password = "" + i + j;

			count++;
			Tools.print("Your password is: " + password);

		}

		return password;
		
		
	}
	
}