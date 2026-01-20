package diExample06;

public class DiscountCalculator {
	public void applyDiscount(String type, int money, Discount discount) {
		int applyDis = discount.dis(type, money);
		System.out.println(type + " : " + applyDis);
	}
}
