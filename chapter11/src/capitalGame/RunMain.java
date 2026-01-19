package capitalGame;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RunMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		HashMap<String, String> g = new HashMap<String, String>();
		
		Game game = new Game();
		
		g.put("한국", "서울");
		g.put("베트남", "하노이");
		g.put("북한", "평양");
		g.put("필리핀", "마닐라");
		g.put("이란", "테헤란");
		g.put("일본", "도쿄");
		g.put("중국", "베이징");
		g.put("태국", "방콕");
		
		System.out.println("*** 수도 맞추기 게임을 시작합니다! ***");
		while(true) {
			System.out.println("[1]추가 [2]퀴즈시작 [3] 종료\n메뉴선택>>");

			String menu = scan.nextLine();
			
//			1 추가
			if(menu.equals("1")) {
				System.out.println("현재 " + g.size() + "개의 나라가 입력되어있습니다.");
				
				while(true) {
					System.out.print("추가할 나라/수도 입력" + (g.size() + 1) + ">> ");
					String addInput = scan.nextLine();

					if(addInput.equals("그만")) {
						System.out.println("입력 종료");
						break;
					}else {
						StringTokenizer st = new StringTokenizer(addInput);
						
						String country = st.nextToken().trim();  // 나라
						String city = st.nextToken().trim();  // 수도
						
						g.put(country, city);
					}
				}
				
//			2 퀴즈 시작
			}else if(menu.equals("2")) {
				System.out.println("퀴즈 시작!");
//				System.out.println(g);
				
				for(String s : g.keySet()) {
					
					System.out.println(s + "의 수도는? ");
					String dap = scan.next();
				
					if(dap.equals(g.get(s))) {
						System.out.println("정답!");
//						return;
					}else if(dap.equals("그만")) {
						System.out.println("게임을 종료합니다.");
						break;
					}else {
						System.out.println("땡!");
						return;
					}
				}
				
//			3 종료
			}else if(menu.equals("3")) {
				System.out.println("게임을 종료합니다.");
				break;
//			예외처리
			}else {
				System.out.println("없는 메뉴입니다.");
			}
		}
	}

}
