import java.util.Random;
import java.util.Scanner;

public class PurchaseOrderManager {
	
	public int orderconfno;
	public int bankauthno;
	
	public String custemail;
	
	Random rnd = new Random();
	
	
	Scanner user_input = new Scanner(System.in);

	
	
	
	CustomerAccount cust = new CustomerAccount();
	BankInterface validatebank = new BankInterface();
	EmailServerInterface email = new EmailServerInterface();
	DeliveryOrder deliveryord = new DeliveryOrder();
	
	
	
	public int requestOrder (String accountid, String ordercontents[]) {
		
		cust.readAccountInfo(accountid);
		
		bankauthno = validatebank.authorize(cust.getCustCardNo());       //maybe save this somewhere
		
		if (bankauthno != 1000000) {
			email.emailConfirmation(cust.getCustEmail());
			
			orderconfno = deliveryord.createOrder(accountid, ordercontents, bankauthno);      //maybe save this somewhere
			
			return orderconfno;
			
		}
		
		else {
			System.out.println("Sorry, couldn't validate bank account");
			orderconfno = 1000000;
			return orderconfno;
		}
		
		// do something for ordercontents
		
				
	}
	
	
	public int createAccRequestOrder(String accountid, int newcardno) {
		
		System.out.println("Enter your email address: ");
		custemail = user_input.nextLine();
		
		int res = cust.createAccount(accountid, newcardno, custemail);
		if (res==1) return 1;
		else return 0;
				
	}
	
		
	public int getBankAuthNo() {
		return bankauthno;		
	}
	
	public int getOrderConfNo() {
		return orderconfno;
	}
	
	public int getOrderConfNum() {
		return rnd.nextInt(100000);
	}
	
}
