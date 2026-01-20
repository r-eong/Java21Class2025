package diExample06;

public class DiscountMain {

	public static void main(String[] args) {
		DiscountCalculator dc = new DiscountCalculator();
		
		dc.applyDiscount("원가", 50000, new NoDiscount());
		dc.applyDiscount("10% 할인", 50000, new PercentDiscount());
		dc.applyDiscount("고정할인", 50000, new FixedDiscount());
	}

}
