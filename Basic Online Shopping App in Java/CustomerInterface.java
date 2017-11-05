public class CustomerInterface {
	
	PurchaseOrderManager placeord = new PurchaseOrderManager();
	
	
	
	public int request(String ordercontents[], String accountid) {
		
		placeord.requestOrder(accountid, ordercontents);
		
		int orderconfno = placeord.getOrderConfNo();
	//	System.out.printf("jdjdjd  %d", orderconfno);
		if (orderconfno!=1000000) {
			return orderconfno;
		}
		else {
			return 1000000;
		}	
		
	}
	
	public int createAccRequestOrder(String accountid, int newcardno) {
		
		int res = placeord.createAccRequestOrder(accountid, newcardno);
		if (res == 1) return 1;
		else return 0;
	
	}

}
