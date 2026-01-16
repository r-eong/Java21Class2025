package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Location lt = new Location();
		
		HashMap<String, Location> location = new HashMap<String, Location>();
		
		System.out.println("도시,경도,위도 를 입력하세요.");
		for(int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String info = scan.nextLine();  // 입력
			
			StringTokenizer st = new StringTokenizer(info, ",");  // 분리
//			나라이름 : 문자(String) / 위도, 경도 : 숫자(int, Integer)
//			┖> 파싱 필요!
			String ct = st.nextToken().trim();  // 도시 추가
			Integer la = Integer.parseInt(st.nextToken().trim());  // 위도 추가
			Integer lo = Integer.parseInt(st.nextToken().trim());  // 경도 추가

			Location loc = new Location(ct, la, lo);  // 객체화
			location.put(ct, loc);
//			location.put(loc.getCity(), loc);  // 위랑 같은 뜻!
		}
		
		System.out.println("--------------------");
		
//		출력
		for(String s : location.keySet()) {
//			Location 객체를 데이터 타입으로 location 참조변수의
//			나라별 이름, 위로, 경도 값을 loca 참조변수에 저장.
			Location loca = location.get(s);
//			객체 데이터 타입을 지정한 경우 출력할 때 내부적으로 자동 toString() 메소드를 호출한다.
			System.out.println(loca.toString());
//			System.out.println(loca);  // 이렇게 해도 위랑 결과는 같음
		}
		
		System.out.println("--------------------");
		
//		검색
		while(true) {
			System.out.print("도시 이름 >> ");
			String input = scan.next();
			
			if(input.equals("그만")) {
				System.out.println("정보 검색종료");
				break;
			}else if(location.containsKey(input)) {
				System.out.println(location.get(input));
			}else {
				System.out.println(input + "이(가) 없습니다.");
			}
		}
		
		scan.close();
	}
}
