package diExample06;

public class PercentDiscount implements Discount {

	@Override
	public int dis(String type, int money) {
		double per = 0.1;
		return (int) (money - (money * per));
	}

}
