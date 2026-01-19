//선생님 코드!

package capitalGame.copy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Game {
//	private String country;  // 나라 
//	private String city;  // 수도
	
	Scanner scan = new Scanner(System.in);
	Random ran = new Random();
	
//	HashMap 은 순서가 없다. 저장도 순서가 없다.
	HashMap<String, String> g = new HashMap<String, String>();
	
//	Java 는 저장하고 컴파일 하면 JVM이 기본 생성자를 제일 먼저 로드한다.
	public Game() {addNation();}
	
//	public Game(String country, String city) {
//		this.country = country;
//		this.city = city;
//	}
	
	public void addNation() {
		g.put("한국", "서울");
		g.put("베트남", "하노이");
		g.put("북한", "평양");
		g.put("필리핀", "마닐라");
		g.put("이란", "테헤란");
		g.put("일본", "도쿄");
		g.put("중국", "베이징");
		g.put("태국", "방콕");
	}

	public void gameMenu() {
		boolean now = true;
		
		System.out.println("*** 수도 맞추기 게임을 시작합니다! ***");
		while(now) {
			System.out.println("[1]추가 [2]퀴즈시작 [3] 종료\n메뉴선택>>");
			int select = scan.nextInt();
//			┖> nextInt 는 숫자만 읽고 엔터(\n)를 남긴다
			
			switch(select) {
				case 1:  // 나라/수도 추가
					insertNation();
					break;
				case 2:  // 게임 시작
					gameStart();
					break;
				case 3:  // 게임 종료
					System.out.println("게임을 종료합니다.");
					now = false;
			}
		}
	}
	
//	나라/수도 추가 메서드
	public void insertNation() {
//		int cnt = g.size();
		
//		문자로 입력받아야 하므로 scan.nextInt()의 이슈인 \n 이 남는 상황을 제거해야함
		scan.nextLine();  // 이건 입력 버퍼 정리
		
//		System.out.println("현재 " + cnt + "개 나라의 수도가 입력되어있습니다.");
		System.out.println("현재 " + g.size() + "개 나라의 수도가 입력되어있습니다.");
		
		while(true) {
//			System.out.println("나라의 수도 입력 " + (cnt + 1) + " >> ");
			System.out.println("나라의 수도 입력 " + (g.size() + 1) + " >> ");
//			cnt++;
			
			String nation = scan.nextLine();
			
			if(nation.equals("그만")) break;
			
//			입력된 문자를 구분자를 기준으로 잘라서 담아주는 클래스
			StringTokenizer st = new StringTokenizer(nation);
			String na = st.nextToken().trim();  // 나라
			String ca = st.nextToken().trim();  // 수도
			
//			이미 저장된 나라와 수도가 존재하면 예외처리
			if(g.containsKey(na)) {  // 같은 나라가 존재하면 true, 아니면 false
				System.out.println("존재하는 나라입니다.");
				continue;  // else if 안쓰면 이거 해줘야함!
			}
			
//			HashMap에 저장
			g.put(na, ca);
		}
	}
	
//	게임 시작 메소드
//	삽입한 나라 이름을 배열로 전환 이슈
//	삽입된 나라 이름이 랜덤하게 문제에 출제되어야 하는 이슈
	public void gameStart() {
		while(true) {
//			ArrayList 의 매개변수로 g.keyset() 의 나라를 사용
			ArrayList<String> nations = new ArrayList<String>(g.keySet());
//			┖> ["한국", "중국", "미국" ...] 처럼 담김!
			System.out.println(g.keySet());
			
//			랜덤하게 나라 이름이 출력되는 문제 만들기
			int index = ran.nextInt(g.size());
			
			String question = nations.get(index);  // ArratList 메소드로 추출
			String answer = g.get(question);
//			예) question = "한국" 일때
//			answer = g.get("한국") -> "한국" 이 value인 값을 출력
			
			System.out.print(question + "의 수도는? >> ");
			String myAnser = scan.next();
			
			if(myAnser.equals("그만")) {
				break;
			}else if(answer.equals(myAnser)) {
				System.out.println("정답!");
			}else {
				System.out.println("오답!");
				continue;
			}
		}
	}
}
