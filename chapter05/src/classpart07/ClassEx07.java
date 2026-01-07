package classpart07;

import java.util.*;

public class ClassEx07 {
	int[] arPrice = { 2500, 3800, 1500, 1000};  // 메뉴별 금액
	String[] arMenu = {"치즈버거", "불고기버거", "감자튀김", "콜 라"};  // 메뉴
	int[] arCount = new int[4];  // 각 메뉴별 개수
	int total = 0;  // 총 금액 (누적)
	int cnt = 0; // 누적 횟수
//	멤버변수
	
//	생성자
	
//	기능 메서드
//	1. 메인에서 while 시작
//	2. 메뉴 선택 -> 누적
//	3. 주문 끝 - 결제 하면 총 금액 출력
//	4. 내가 낼 금액 적기
//	5. 총 주문 수량 / 받은 금액, 총 금액 / 잔액 출력
//	6. 종료
	
	Scanner scan = new Scanner(System.in);

	public int order() {
		int chioce = scan.nextInt();
		
		if(chioce == 0) {
			return;
		}else {
			arCount[cnt] += total;
			cnt++;
		}
	}
}
