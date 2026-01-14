package inheritance04;

public class GoldCustomer extends Customer {
//	기본 생성자
	public GoldCustomer() {}
//	매개변수 생성자
	public GoldCustomer(String customerName) {
		super.customerName = customerName;
		super.customerGrade = "GOLD";
		super.bonusRatio = 0.02;
		super.salePrice = 0.1;
	}
	
//	@Override
//	public void showCustomerInfo() {
//		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스는 " + df.format(bonusPoint) + "입니다. ");
//	}
}
