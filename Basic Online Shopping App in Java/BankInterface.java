import java.util.Random;

public class BankInterface {
	Random rnd = new Random();
		
	public int authorize(int custcardno) {
		int number = rnd.nextInt(15);
		if (number<2) {
			System.out.printf("Card denied. Not enough balance.\n");
			return 1000000;
		}
		else if (number <3) {
			System.out.printf ("Card not registered on the account\n"); //check to see if the credit card exists in the system
			return 1000000;
		}
		else {
			System.out.printf ("Card confirmed!!\n");
			return rnd.nextInt(100000);		//generate an authorization number
		}
		
		
	}

}
