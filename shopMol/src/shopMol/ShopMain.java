package shopMol;

import java.util.*;

public class ShopMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Shooping sh = new Shooping();
		
		boolean now = true;
		
		while(now) {
//			메뉴
			sh.menu();
			int menu = scan.nextInt();
//			메뉴 1 로그인
			if(menu == 1) {
				sh.login();
//			메뉴 2 로그아웃
			}else if (menu == 2){
//				로그인 안 했을 때 
				if(sh.log == -1) {
					System.out.println("로그인 후 이용 가능합니다.");
				}
				sh.logout();
				
//			메뉴 3 쇼핑
			}else if (menu == 3){
//				로그인 안 했을 때 
				if(sh.log == -1) {
					System.out.println("로그인 후 이용 가능합니다.");
				}
				
				
//			메뉴 0 종료
			}else {
				System.out.println("쇼핑몰 종료. 안녕히 가세요.");
				now = false;
			}
		}
	}

}
