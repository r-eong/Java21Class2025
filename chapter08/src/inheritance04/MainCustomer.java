package inheritance04;

import java.text.DecimalFormat;

public class MainCustomer {

	public static void main(String[] args) {
		Customer c = new Customer("홍길동");
		
//		VIPCustomer v = new VIPCustomer("개나리", 1010);
		Customer v = new VIPCustomer("개나리", 1010);  //  이렇게 쓸 수 있음!
//		┖> 상속받은 하위클래스는 상위클래스를 데이터 타입으로 인스턴스화 할 수 있다.
		
		DecimalFormat df = new DecimalFormat("#,##0원");
		
		System.out.print("지불 금액은 " + df.format(c.calcPrice(10000)) + "이고, ");
//		c.showCustomerInfo();
		System.out.println(c.showCustomerInfo2());  // 출력 다른방법 이용함!
		
		System.out.println();
		
		System.out.print("지불 금액은 " + df.format(v.calcPrice(10000)) + "이고, ");
		v.showCustomerInfo();
	}

}
