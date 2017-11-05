import java.util.Random;

public class DeliveryOrder {
	
	Random rnd = new Random();
	
	public int createOrder(String accountid, String ordercontents[], int bankauthno) {
		System.out.printf("Your delivery order has been placed linked with the accountID: %s\n", accountid);
		System.out.printf("Your orders are: %s\n\t\t %s\n\t\t %s\n", ordercontents[0], ordercontents[1], ordercontents[2]);
		System.out.printf("The bank authorization number is: %d\n", bankauthno);
		
		return rnd.nextInt(100000);            //generate a confirmation number is save it
		
		//maybe save the above passed parameters into some database together with the confirmation number
	}
	
}
