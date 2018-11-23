package customerManagement;

import java.util.Scanner;

public class Console {
	static Scanner sc = new Scanner(System.in);

	public static void displayMenu() {
		String menu = "\nlist  - List all customers\n" + "add   - Add a custoer\n" + "del   - Delete a customer\n"
				+ "help  - Show this menu\n" + "exit  - Exit this application\n";
		System.out.println(menu);
	}

	public static String displayMessage(String message) {
		String choice;

		System.out.print(message);

		choice = sc.nextLine();
		System.out.println();

		return choice;
	}

	public static String getCustomerFirstName() {
		System.out.print("Enter first name: ");
		String fName = sc.nextLine();
		return fName;
	}

	public static String getCustomerLastName() {
		System.out.print("Enter last name: ");
		String lName = sc.nextLine();
		return lName;
	}

	public static String getCustomerEmail() {
		System.out.print("Enter customer email address: ");
		String email = sc.nextLine();
		return email;
	}

}
