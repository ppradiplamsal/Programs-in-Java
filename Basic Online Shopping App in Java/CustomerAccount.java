import java.util.Random;

public class CustomerAccount {
	private String custemail;
	private int custcardno;
	
	
	Random rnd = new Random();
	
	public void readAccountInfo (String accountid) {
		this.custcardno = rnd.nextInt(1000000);        //supposed to extract the card number linked with the given accountID from the database
		this.custemail = "customer1@newcompany.com"; //some random email;
	}
	
	
	public int createAccount(String accountid, int newcardno, String custemail) {
		
		System.out.println("Congratulations your new account has been created");
		System.out.printf("Your new accountid is: %s\n", accountid);
		System.out.printf("The email addresses linked is: %s\n", custemail);
		System.out.printf("The bank account linked with your account is: %d\n", newcardno);
		
		return 1;
		
		
		
	}
	
	
	
	
	
	public String getCustEmail() {   
		return this.custemail;
	}
	
	public int getCustCardNo() {
		return this.custcardno;
	}
}
