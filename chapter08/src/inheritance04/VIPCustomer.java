package inheritance04;

public class VIPCustomer extends Customer {
	protected int num;  // 담당 상담원 번호
	
	public VIPCustomer() {}
	
	public VIPCustomer(String customerName, int num) {
//		super(customerName, customerID);  // 아래처럼 하나하나 안 쓰고 이렇게 써도 됨!
		super.customerName = customerName;
		super.customerGrade = "VIP";
		super.bonusRatio = 0.05;  // 포인트
		super.salePrice = 0.1;  // 할인율
		this.num = num;
//		super.customerID = customerID;
//		super.bonusPoint = bonusPoint;
	}
	
	@Override
	
	public void showCustomerInfo() {
		super.showCustomerInfo();
//		super.showCustomerInfo2();  // 출력 다른방법!
		System.out.print("담당 전문 상담은 " + num + "번입니다.");
	}
}
