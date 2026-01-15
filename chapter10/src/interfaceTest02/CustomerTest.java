package interfaceTest02;

public class CustomerTest {

	public static void main(String[] args) {
		Customer cus = new Customer();
		
		Buy buy = cus;
		Sell sell = cus;
		
		buy.buy();
		sell.sell();
		
		cus.order();
		buy.order();
		sell.order();
	}

}
