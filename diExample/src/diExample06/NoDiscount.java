package diExample06;

public class NoDiscount implements Discount {

	@Override
	public int dis(String type, int money) {
		return money;
	}

}
