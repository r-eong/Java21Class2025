package diExample06;

public class FixedDiscount implements Discount {

	@Override
	public int dis(String type, int money) {
		int fix = 5000;
		return money - fix;
	}

}
