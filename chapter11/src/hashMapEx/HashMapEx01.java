package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> nations = new HashMap<String, Integer>();

		System.out.println("나라 이름과 인구를 입력하세요. 예) korea/5000");
		
		while(true) {
			System.out.println("나라이름/인구 >>"); 
			String addinput = scan.nextLine();
			
			if(addinput.equals("그만")) {
				break;
			}
			
			StringTokenizer i = new StringTokenizer(addinput, "/");  // 입력한 문장 단어로 분리
			String nation = i.nextToken().trim();  // 나라
//			System.out.println(i.nextToken());  // 확인용
//			System.out.println(i.nextToken());
			
//			Integer 데이터타입으로 parse (형변환) 해야함
//			parse 는 반드시 클래스여야한다 - 래퍼클래스
			Integer people = Integer.parseInt(i.nextToken().trim());  // 인구수
			
			nations.put(nation, people);  // 분리한 단어 배열에 저장  String, Integer
			
		}
		
		
		while(true) {
			System.out.println("나라별 인구 검색 >>");
			String findInput = scan.next();
			
			if(findInput.equals("그만")) {
				System.out.println("인구 검색 종료");
				break;
			}else if(!findInput.equals(findInput)) {
				System.out.println(findInput + "라는 나라는 없습니다.");
			}else {
				System.out.println(findInput + "의 인구는 " + nations.get(findInput) + "명 입니다.");
			}
		}
	}

}
