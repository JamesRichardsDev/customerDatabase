package customerManagement;

import java.util.ArrayList;

public class CustomerApp {

	public static void main(String[] args) throws Exception {
		CustomerDB db = new CustomerDB();
		boolean shouldContinue = true;

		while (shouldContinue) {
			

			Console.displayMenu();
			String choice = Console.displayMessage("Enter a command: ");

			if (choice.equalsIgnoreCase("list")) {
				ArrayList<Customer> cust = new ArrayList<>(CustomerDB.getCustomers());
				for(Customer c : cust) {
					System.out.printf("%-32s %-22s %-22s",c.emailAddress,c.firstName,c.lastName);
					System.out.println();
				}
			} else if (choice.equalsIgnoreCase("add")) {
				String email = Console.getCustomerEmail();
				String first = Console.getCustomerFirstName();
				String last = Console.getCustomerLastName();

				CustomerDB.AddCustomer(first, last, email);

			} else if (choice.equalsIgnoreCase("del")) {
				String email = Console.getCustomerEmail();

				CustomerDB.deleteCustomerByEmail(email);

			} else if (choice.equalsIgnoreCase("help")) {
				continue;

			} else if (choice.equalsIgnoreCase("exit")) {
				shouldContinue = false;

			} else
				System.out.println("That is not a valid input");

		}

		System.out.println("Goodbye!");

	}
}
