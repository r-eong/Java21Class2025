package inheritance04;

import java.text.DecimalFormat;

public class Customer {
//	멤버변수
	protected String customerID;  // 고객 아이디
	protected String customerName;  // 고객 이름
	protected String customerGrade;  // 고객 등급 (기본 - silver)
	protected int bonusPoint;  // 고객의 보너스 포인트 (누적)
	protected double bonusRatio;  // 보너스 포인트 적립 비율 (1%)
	
	protected double salePrice;  // 할인율
	
	DecimalFormat df = new DecimalFormat("#,##0원");
	
//	기본 생성자
	public Customer() {}
	
//	매개변수 생성자
	public Customer(String customerName) {
		this.customerName = customerName;
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
		this.salePrice = 0;
//		this.customerID = customerID;
//		this.bonusPoint = bonusPoint;
	}
	
//	지불해야하는 금액, 보너스 포인트
	public int calcPrice(int price) {
		if(customerGrade == "SILVER") {
			bonusPoint += (price * bonusRatio);
		}else {
			bonusPoint += (price * bonusRatio);
			price -= price * salePrice;
		}
		
		return price;
	}
//	전체 출력 메서드
	public void showCustomerInfo() {
		System.out.println(customerName + "님의 등급은 " + customerGrade + "이며, 보너스는 " + df.format(bonusPoint) + "입니다. ");
	}
//	전체 출력 다른방법
	public String showCustomerInfo2() {
		return customerName + "님의 등급은 " + customerGrade + "이며, 보너스는 " + df.format(bonusPoint) + "입니다. ";
	}
}
