package classpart07;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
//		while() 문은 메인에서
//		main()은 계산로직, 저장로직, 처리로직을 쓰지 않는다.
//		main() -> 객체화(=인스턴스화), 메소드 호출, 실행 순서 정하기
		
		Scanner scan = new Scanner(System.in);
		
//		class 호출(객체화)
		ClassEx07 ce07 = new ClassEx07();
		
//		ClassEx07 class()에 접근하는 방법
//		참조변수.멤버변수 / 참조변수.메소드
		ce07.name = "햄버거";
		
//		순서 정하기
		boolean now = true;
		
		while(now) {
			ce07.printMenu();
			System.out.println("메뉴 선택 >>");
			int sel = scan.nextInt();
			
//			메뉴 선택
			if(sel >= 1 && sel <= 4) {
				ce07.order(sel - 1);  // index 는 0부터 시작해서
			}else if(sel == 0) {
//				주문 완료
				if(!ce07.hasOrder()) {  // false 는 주문 안들어간 상태
					System.out.println("주문 내역이 없습니다");
					continue;
				}
				
//				총 금액 함수호출
				ce07.calcTotal();
				System.out.println("총 금액 : " + ce07.total + "원");
				System.out.println("지불할 금액 : ");
				int money = scan.nextInt();
				
				if(money < ce07.total) {
					System.out.println("금액이 부족합니다");
					continue;
				}
				
//				영수증 출력 함수호출
				ce07.printReceipt(money);
				now = false;
			}
		}
	}

}
