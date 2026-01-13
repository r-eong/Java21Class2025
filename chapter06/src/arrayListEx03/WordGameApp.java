package arrayListEx03;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGameApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ArrayList<Player> users = new ArrayList<Player>();
		
		boolean now = true;
		
		System.out.println("참가자 수를 입력하세요 >>");
		int userCount = scan.nextInt();
		
		for(int i = 0; i < userCount; i++) {
			System.out.println((i + 1) + "번 참가자 이름 : ");
			String user = scan.next();
//			System.out.println("오류");
			users.add(new Player(user));
			//users.get(i).userList = user;
		    
		}
		
		String firstword = "아버지";
		System.out.println("게임 시작!");
		System.out.println("현재 단어 : " + firstword);
		System.out.println(users.size());
		
		while(now) {
			for(int i = 0; i < users.size(); i++) {
				System.out.println(users.get(i).userList + " >> ");
				
				String word = scan.next();
				
				if(firstword.charAt(firstword.length() - 1) == word.charAt(0)) {
					firstword = word;
					System.out.println("현재 단어 : " + firstword);
					continue;
				}else {
					System.out.println("게임종료!");
					System.out.println("틀린 참가자 : " + users.get(i).userList);
					now = false;
					break;
				}
			}
		}
	}

}
