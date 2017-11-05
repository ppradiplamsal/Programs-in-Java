import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner user_input = new Scanner(System.in);
		CustomerInterface custintf = new CustomerInterface();
		PurchaseOrderManager placeord = new PurchaseOrderManager();
		
		
		
		System.out.print("Press any number other than 1 to continue with your account, or the number '1' to create a new: ");
		
		int option = user_input.nextInt();
		
		if (option == 1) {
			
			user_input.nextLine();
			System.out.print("\nEnter your accountID: ");
			String accountid = user_input.nextLine();
			
			System.out.print("\nEnter your credit card number: ");
			int newcardno = user_input.nextInt();
			user_input.nextLine();
			System.out.print("\n");
			
			int res = custintf.createAccRequestOrder(accountid, newcardno);
			
			if (res==1) System.out.println("Congratulations, you have successfully created your account.");
			else System.out.println("Sorry could not do it this time. Close the system and start all over again.");
		}
		
		else {
			
			user_input.nextLine();
			System.out.println("\nEnter your accountID: ");
			String accountid = user_input.nextLine();
			
			String ordercontents[] = {"Pen", "Gun", "Rice"};
			
			int orderconfno = custintf.request(ordercontents, accountid);
			
			if (orderconfno!=1000000) {
				System.out.println("Congratulations on your purchase");
				System.out.printf("Your order confirmation number is: %d\n", placeord.getOrderConfNum());
				
			}
			
			else {
				System.out.println("You had issues and transaction could not be made. Please try again later.");
			}
		}
		

		user_input.close();
	}
	

}


