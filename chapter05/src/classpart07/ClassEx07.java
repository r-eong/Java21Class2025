package classpart07;

import java.util.*;

public class ClassEx07 {
//	멤버변수(전역변수)
	int[] arPrice = { 2500, 3800, 1500, 1000};  // 메뉴별 금액
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};  // 메뉴
	int[] arCount = new int[4];  // 각 메뉴별 개수
	String name;  // 가게이름
	int total = 0;  // 총 금액 (누적)
	
//	생성자
//	기능 메서드
//	1. 메인에서 while 시작
//	2. 메뉴 선택 -> 누적
//	3. 주문 끝 - 결제 하면 총 금액 출력
//	xx4. 내가 낼 금액 적기xx
//	5. 영수증 - 총 주문 수량 / 받은 금액, 총 금액 / 잔액 출력
//	6. 종료
	
//	객체 샌성시 초기화에 필요한 디폴트 생성자
//	생성자는 반드시 클래스 이름과 동일해야함
	public ClassEx07() {}
	
//	메뉴 출력
//	void 는 반환할 값이 없는 메소드 생성시 사용
	public void printMenu() {
		System.out.println("\n[" + name + "]");
		for(int i = 0; i < arMenu.length; i++) {
			System.out.print((i+1) + ". " + arMenu[i] + "\t" + arPrice[i] + "원\n");
		}
		System.out.println("0. 주문완료");
		System.out.println("----------------------");
	}
	
//	주문 추가
	public void order(int sel) {
		arCount[sel]++;
		System.out.println(arMenu[sel] + "추가됨");
	}
	
//	총 금액 계산
	public void calcTotal() {
//		원래 합계, 총계, 최대값, 최소값 등의 변수는 지역변수로 사용!
		total = 0;
		
		for(int i = 0; i < arMenu.length; i++) {
			total += (arPrice[i] * arCount[i]);
		}
	}
	
//	주문 여부 확인
//	반환항 값이 필요한 경우 반드시 데이터 타입으로 메서드 작성 ex) int, boolean ...
	public boolean hasOrder() {
		for(int i = 0; i < arMenu.length; i++) {
			if(arCount[i] > 0) {
				return true;  // 주문 들어감
			}
		}
		return false;  // 주문 안 들어감
	}
	
//	영수증 출력
	public void printReceipt(int money) {
		System.out.println("영수증");
		System.out.println("매장명 : " + name);
		System.out.println("----------------------");
		System.out.println("메뉴\t수량\t금액");
		
		for(int i = 0; i < arMenu.length; i++) {
			if(arCount[i] > 0) {
				System.out.println(arMenu[i] + "\t" + arCount[i] + "\t" + (arPrice[i] * arCount[i]));
			}
		}
		
		System.out.println("----------------------");
		System.out.println("총 금액 : " + total);
		System.out.println("받은 돈 : " + money);
		System.out.println("----------------------");
		System.out.println("잔  돈 : " + (money - total));
	}
}
