package example;

import java.util.Scanner;

public class LoopEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
//		유저 1
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
//		유저 2
		int dbAcc2 = 2222;
		int dbPw2 = 2345;

		boolean bool = true;
		
//		로그인
		while(bool == true) {
			System.out.println("1. 로그인\n2. 로그아웃\n0. 종료");
			int menuChoi = scan.nextInt();
			if(menuChoi == 1) {
				System.out.println("계좌번호 입력 : ");
				int acc = scan.nextInt();
				
				if(acc == dbAcc1 || acc == dbAcc2) {
					System.out.println("비밀번호 입력 : ");
					int pw = scan.nextInt();
					
					if(pw == dbPw1 || pw == dbPw2) {
						if(pw == dbPw1) {
							System.out.println(dbAcc1 + "님 환영합니다!");
						}else {
							System.out.println(dbAcc2 + "님 환영합니다!");
						}
					}else {
						System.out.println("비밀번호를 확인해주세요");
					}
				}else {
					System.out.println("계좌번호를 확인해주세요");
				}
			}else if(menuChoi == 2) {
				if(bool == true) {
					System.out.println("로그인하세요");
				}else {
					System.out.println("로그아웃 되었습니다");
				}
			}else {
				System.out.println("프로그램 종료");
				bool = false;
			}
			
		}
		
	}

}
