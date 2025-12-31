package example;

import java.util.Scanner;

public class LoopEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int dbAcc1 = 1111;
		int dbPw1 = 1234;
		int dbMoney1 = 50000;

		int dbAcc2 = 2222;
		int dbPw2 = 2345;
		int dbMoney2 = 70000;
		
		boolean bool = true;
//		로그인 상태
		int state = 0;
//		총 금액
		int totalMoney = 0;
		int totalMoney1 = dbMoney1 + totalMoney;
		int totalMoney2 = dbMoney2 + totalMoney;
		
		while(bool == true) {
			System.out.printf("dbMoney1 = %d원\n", totalMoney1);
			System.out.printf("dbMoney2 = %d원\n", totalMoney2);
			
//			로그인 상태
			if(state == 0) {
				System.out.println("*상태 : 로그아웃");
//				state = 0;
			}else {
				System.out.println("*상태 : 로그인");
			}
			
//			메뉴
			System.out.println("1. 로그인\n2. 로그아웃\n3. 입금\n4. 출금\n5. 이체\n6. 조회\n0. 종료\n메뉴 선택 >>");
			int userState = scan.nextInt();

//			로그인
			if(userState == 1) {
				System.out.println("계좌 입력 : ");
				int acc = scan.nextInt();
				
				if(acc == dbAcc1 || acc == dbAcc2) {
					System.out.println("비밀번호 입력 : ");
					int pw = scan.nextInt();
					
					if(pw == dbPw1 || pw == dbPw2) {
						if(pw == dbPw1) {
							System.out.println(dbAcc1 + "님 환영합니다.");
							state = 1;
						}else {
							System.out.println(dbAcc2 + "님 환영합니다.");
							state = 2;
						}
					}else {
						System.out.println("비밀번호를 확인해주세요.");
					}
				}
				
//			로그아웃
			}else if(userState == 2) {
				if(state == 0) {
					System.out.println("로그인 후 이용가능");
				}else {
					System.out.println("로그아웃 되었습니다");
					state = 0;
				}
				
//			입금
			}else if(userState == 3) {
				if(state == 0) {
					System.out.println("로그인 후 이용가능");
				}else {
					System.out.println("입금 할 금액 입력 : ");
					int addMoney = scan.nextInt();
					
					if(state == 1) {
						totalMoney1 += addMoney;
						System.out.printf("입금을 완료하였습니다.\n총 금액 : %d\n", totalMoney1);
					}else if(state == 2) {
						totalMoney2 += addMoney;
						System.out.printf("입금을 완료하였습니다.\n총 금액 : %d\n", totalMoney2);					
					}
				}
				
//			출금
			}else if(userState == 4) {
				if(state == 0) {
					System.out.println("로그인 후 이용가능");
				}else {
					System.out.println("출금 할 금액 입력 : ");
					int delMoney = scan.nextInt();
					
					if(state == 1) {
						totalMoney1 -= delMoney;
						System.out.printf("출금을 완료하였습니다.\n총 금액 : %d\n", totalMoney1);
					}else if(state == 2) {
						totalMoney2 -= delMoney;
						System.out.printf("출금을 완료하였습니다.\n총 금액 : %d\n", totalMoney2);					
					}
				}
				
//			이체
			}else if(userState == 5) {
				if(state == 0) {
					System.out.println("로그인 후 이용가능");
				}else {
					System.out.println("이체 할 계좌번호 입력 : ");
					int giveAcc = scan.nextInt();
					System.out.println("이체 할 금액 입력 : ");
					int give = scan.nextInt();
					
					if(giveAcc == 2222) {
						totalMoney1 -= give;
						totalMoney2 += give;
						System.out.println("이체를 완료하였습니다.");
					}else if(giveAcc == 1111) {
						totalMoney2 -= give;
						totalMoney1 += give;
						System.out.println("이체를 완료하였습니다.");
					}
				}
				
//			조회
			}else if(userState == 6) {
				if(state == 1) {
					System.out.printf("dbMoney1 = %d원\n", totalMoney1);
				}else if(state == 2) {
					System.out.printf("dbMoney2 = %d원\n", totalMoney2);
				}else {
					System.out.println("로그인 후 이용가능");
				}
			}else {
				System.out.println("종료되었습니다.");
				bool = false;
			}
		}
	}

}
