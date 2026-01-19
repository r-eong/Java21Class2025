package hashMapEx;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HashMapEx04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		HashMap<String, Integer> user = new HashMap<String, Integer>();
		
		System.out.println("*** 포인트 관리 프로그램 **");
		
		while(true) {
			System.out.print("\n이름과 포인트 입력 >> ");
			String input = scan.nextLine();
			
//			그만 예외처리
			if(input.equals("그만")) {
				System.out.println("포인트 관리 종료");
				break;
			}
			
			StringTokenizer st = new StringTokenizer(input);
			String name = st.nextToken().trim();
			Integer point = Integer.parseInt(st.nextToken().trim());
			
//			중복된 고객 포인트 누적
			if(user.containsKey(name)) {
				point += user.get(name);
			}
			
			user.put(name, point);  // HashMap 에 저장
			
//			출력 누적
			for(String s : user.keySet()) {
				System.out.print("(" + s + ", " + user.get(s) + ") ");
			}
		}
	}

}
