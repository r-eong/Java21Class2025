package inheritance04;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class MainCustomer {

	public static void main(String[] args) {
		ArrayList<Customer> cusList = new ArrayList<Customer>();
		
//		인스턴스화
		Customer c1 = new Customer("이순신");
		Customer c2 = new Customer("신사임당");
		
		Customer g1 = new GoldCustomer("홍길동");
		Customer g2 = new GoldCustomer("이율곡");
		
//		VIPCustomer v = new VIPCustomer("개나리", 1010);
		Customer v = new VIPCustomer("김유신", 1234);  //  이렇게 쓸 수 있음!
//		┖> 상속받은 하위클래스는 상위클래스를 데이터 타입으로 인스턴스화 할 수 있다.
		
//		업캐스팅
		cusList.add(c1);
		cusList.add(c2);
		cusList.add(g1);
		cusList.add(c2);
		cusList.add(v);
		
		DecimalFormat df = new DecimalFormat("#,##0원");
		
		System.out.println("=== 고객정보 출력 ===");
//		c1.showCustomerInfo();  // 이순신
//		c2.showCustomerInfo();  // 신사임당
//		g1.showCustomerInfo();
//		g2.showCustomerInfo();
//		v.showCustomerInfo();
		
		for(int i = 0; i < cusList.size(); i++) {
			cusList.get(i).showCustomerInfo();
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("=== 보너스 포인트와 할인율 결과 ===");
//		System.out.print(c1.customerName + "님의 지불 금액은 " + df.format(c1.calcPrice(10000)) + "입니다.\n");
//		c1.showCustomerInfo();
//		
//		System.out.print(c2.customerName + "님의 지불 금액은 " + df.format(c2.calcPrice(10000)) + "입니다.\n");
//		c2.showCustomerInfo();
//		
//		System.out.print(g1.customerName + "님의 지불 금액은 " + df.format(g1.calcPrice(10000)) + "입니다.\n");
//		g1.showCustomerInfo();
//		
//		System.out.print(g2.customerName + "님의 지불 금액은 " + df.format(g2.calcPrice(10000)) + "입니다.\n");
//		g2.showCustomerInfo();
//		
//		System.out.print(v.customerName + "님의 지불 금액은 " + df.format(v.calcPrice(10000)) + "입니다.\n");
//		v.showCustomerInfo();
		
		int price = 100000;  // 지불금액
		
		for(int i = 0; i < cusList.size(); i++) {
			int money = cusList.get(i).calcPrice(price);
			System.out.println(cusList.get(i).customerName + "님이 " + df.format(money) + " 지불하셨습니다.");
			cusList.get(i).showCustomerInfo();
		}
	}

}
