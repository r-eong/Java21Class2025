package classpart05;

import java.util.*;

public class ClassEx05 {
//	멤버변수
//	정답지
	int[] answer = {1, 3, 4, 2, 5};
//	랜덤숫자 넣을 빈배열
	int[] hgd = new int[5]; // 모든 배열 초기값 0
	
	Random ran = new Random();
	
	public void answerResult() {
//		answer 출력
		for(int i = 0; i < answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
	
//	랜덤
	public void randomResult() {
		int ranhgd = ran.nextInt(5) + 1;
		for(int i = 0; i < hgd.length; i++) {
			hgd[i] += ranhgd;
		}
		
//		hgd 출력
		for(int i = 0; i < hgd.length; i++) {
			System.out.print(hgd[i] + " ");
		}
	}
	
//	비교
	public void compare() {
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == hgd[i]) {
				System.out.print("○ ");
			}else {
				System.out.print("Ⅹ ");
			}
		}
	}
	
//	성적 합
	public int totalSum() {
		int total = 0;
		for(int i = 0; i < answer.length; i++) {
			if(answer[i] == hgd[i]) {
				total += 10;
			}else {
				total += 0;
			}
		}
		System.out.println("\n성적 : " + total);
		return total;
	}
	
	
	
////	모범답안, 랜덤, 정오표, 점수 출력하는 함수
////	확장 for()문
//	public void printResult() {
//		System.out.println("정답 : ");
////		확장 for()문 사용 방법
////		for(자료형 변수 : 배열){ 실행문; }
//		
////		확장 for()문의 장점
////		1. indwx 를 사용하지 않음
////		2. 코드가 짧다
////		3. 요소를 하나씩 처리한다
//		
////		int[] answer = {1, 3, 4, 2, 5};
////		answer 배열에서 값을 하나 꺼내서 n에 담고 출력.
////		배열이 끝날 때까지 계속 순화한다.
////		단, indwx 를 가져올 수 없기 때문에 
////		배열방의 값을 비교할 때는 사용 불가.
//		
//		System.out.println("\n 정답 : ");
//		for(int n : answer)  // 여기서 int 는 배열과 같게 
//			System.out.println(n + " ");
//		
//		System.out.println("\n 응답 : ");
//		for(int n : hgd)
//			System.out.println(n + " ");
//		
//		System.out.println("\n 정오표 : ");
//		for(int n : )
//	}
}
