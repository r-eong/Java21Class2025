package otShopMol;

import java.util.*;

public class UserMenu extends User {
//	상속받은 User 클래스의 멤버변수, 생성자, 메소드 인스턴스화 하지 않아도 접근가능
	
	Scanner scan = new Scanner(System.in);
	
	int cnt = id.length;  // 전체 유저 수
	static int logIndex;  // 로그인한 유저 인덱스 (다른 클래스와 공유)
	
//	사용자 로그인 메소드
	public int userLogin() {
		int log = super.log;  // 부모인 User 클래스의 로그인 상태 사용
		System.out.print("아이디 : ");
		String myId = scan.next();
		System.out.print("비밀번호 : ");
		String mypw = scan.next();
		
//		id, pw 로 로그인 성공/실패
		for(int i = 0; i < cnt; i++) {
			if(myId.equals(id[i]) && mypw.equals(pw[i])) {
				log = i;
				System.out.println("로그인 성공\n");
			}
		}
		
//		if문으로 비교
		if(log < 0) {
			System.out.println("아이디와 비밀번호를 확인하세요.");
		}else if(log == 0) {
			System.out.println("당신은 관리자입니다.");
		}else {
			System.out.println(id[log] + "님 어서오세요!");
			logIndex = log;  // 다른 클래스에서 사용하기 위해 공유
		}
		
		return log;
	}
}
