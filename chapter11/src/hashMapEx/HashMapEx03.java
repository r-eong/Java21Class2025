package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
//		Map 의 key 와 value 의 데이터 타입은 반드시 클래스 또는 래퍼클래스 여야 함
		HashMap<String, Double> hackjum = new HashMap<String, Double>();
		
		System.out.println("미래 장학금 관리 시스템 입니다.");
		
		for(int i = 0; i < 5;) {
			System.out.print("이름 학점 >> ");
			String input = scan.nextLine();
			
			StringTokenizer st = new StringTokenizer(input);
			String name = st.nextToken().trim();  // 이름
			Double score = Double.parseDouble(st.nextToken().trim());  // 학점
			
//			0.0 ~ 4.5 예외처리
			if(score < 0.0 || score > 4.5) {
				System.out.println("학점을 다시 입력하세요");
				continue;
			}
			
			hackjum.put(name, score);  // HashMap 에 추가
			i++;  // 조건이 만족할 때만 for문 i 누적
		}
		
		System.out.print("장학생 선발 학생 기준 입력 >> ");
		double kijun = scan.nextDouble();
		
		System.out.print("장학생 명단 : ");
		
		for(String s : hackjum.keySet()) {
			if(kijun < hackjum.get(s)) {
				System.out.print(s + " ");
			}
		}
		
//		hackjum.keySet() -> ["이름1", "이름2", 이름3", ...] : keySet 은 key, index 역할임!!
//		hackjum.get() -> [4.1. 2.0, 3.6, ...] : get 은 value, index 의 값 역할을 함!! 
	}

}
