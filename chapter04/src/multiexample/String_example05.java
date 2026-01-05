package multiexample;

import java.util.*;

public class String_example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		객체 데이터 타입의 기본값은 null
		String[][] items = new String[100][2];
		
//		null 값을 공백으로 초기화 함
		for(int i = 0; i < items.length; i++) {
			for(int j = 0; j < items[i].length; j++) {
				items[i][j] = "";
			}
		}
		
		boolean bool = true;
		
		int cateCnt = 0;

		while(bool == true) {
			System.out.println("[관리자 모드]");
			System.out.println("[1]카테고리 관리\n[2]아이템 관리\n[3]전체품목 출력\n[0]종료");
			
			System.out.println("모드 선택 >> ");
			int mode = scan.nextInt();
			
			if(mode >= 0 && mode <= 3) {
//			카테고리 관리
				if(mode == 1) {
					System.out.println("추가 할 카테고리 입력");
					String cate = scan.next();
					
					items[cateCnt][0] = cate;
					cateCnt++;
					
//			아이템 관리
				}else if(mode == 2) {
					for(int i = 0; i < cateCnt; i++) {
						if(cateCnt >= 0) {
							System.out.println("카테고리를 먼저 추가해주세요");
						}else {
							System.out.println("[" + i + "]" + items[i][0]);
						}
					}
					
					System.out.println("카테고리를 선택하세요");
					int choiceCate = scan.nextInt();
					
					System.out.println("추가 할 아이템 입력");
					String addItem = scan.next();
					
					items[choiceCate][1] += addItem;
					items[choiceCate][1] += " / ";
					
//			전체품목 출력
				}else if(mode == 3) {
					for(int i = 0; i < cateCnt; i++) {
						System.out.printf("[%d] %s : %s\n", i, items[i][0], items[i][1]);
					}
					
//			종료
				}else {
					System.out.println("프로그램 종료");
					bool = false;
				}
			}else {
				System.out.println("명령어를 다시 확인하세요");
			}
		}
	}

}
