package schedluer;

import java.util.Scanner;

public class SchedlueTest {

	public static void main(String[] args) {
//		Scanner 입력 -> L, P, R
		Scanner scan = new Scanner(System.in);
		
		System.out.println("전화 상담 배분 방식을 선택하세요. : R, L, P");
		
//		대문자 R 또는 r, P 또는 p, L 또는 l
		String ch = scan.next();
		
		Schedluer sch = null;  // 업캐스팅
		
		if(ch.equals("R") || ch.equals("r")) {
//			RoundRobin 인스턴스
			sch = new RoundRobin();
		}else if(ch.equals("P") || ch.equals("p")) {
			sch = new PriorityAllocation();
		}else if(ch.equals("L") || ch.equals("l")) {
			sch = new LeastJob();
		}else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		
//		메소드 출력
		sch.getNestCall();
		sch.sendCallToAgent();
		sch.getLunch();
	}

}
