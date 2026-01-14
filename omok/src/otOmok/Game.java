package otOmok;

import java.util.*;

public class Game {
	Scanner scan = new Scanner(System.in);
	
//	객체화
	GameElements ge = new GameElements();
	
//	while 상태
	boolean now = true;
	
	int menu = -1;
	
//	메뉴 출력 메서드
	public void menu() {
		while(now) {
			System.out.println("[오목]\n[1]게임시작\n[2]전적확인\n[0]종료\n메뉴선택 >> ");
			menu = scan.nextInt();
			
			switch(menu) {
			case 1 :
				playGame();
				now = true;
				break;
			case 2:
				showGameRecord();  // 전적 메서드 호출
				break;
			case 0 :
				now = false;
				System.out.println("게임종료");
				break;
			}
		}
	}
	
//	게임 플레이 메서드
	public void playGame() {
		System.out.println("게임시작!\n플레이어1 : ★(흑돌) / 플레이어2 : ☆(백돌)");
		ge.setCheckBoard();
		ge.printCheckerBoard();
		
		while(now) {  // 전체 while 시작
			System.out.println("플레이어1 - 놓을 위치를 입력하세요.");
			
			while(true) {  // 플레이어1 while 시작
				System.out.println("세로(1~13) >>");
				int row = scan.nextInt();
				System.out.println("가로(1~13) >>");
				int column = scan.nextInt();
				
//				13 초과 예외처리 메서드 호출
//				isCheckPostion(행, 열) 의 벗어남. false
				if(!ge.isCheckPostion(row, column)) {
					System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
					continue;
				}
				
//				중복 예외처리
//				원래는 row, column 순서인데 GameElements에서 잘못써서 반대로 써야됨!! 
				if(ge.checkerBoard[column-1][row-1].equals("★") || ge.checkerBoard[column-1][row-1].equals("☆")) {
					System.out.println("이미 놓여진 자리입니다. 다시 입력하세요.");
					
//				중복되지 않아서 돌 올려놓을거임
				}else {
					ge.placeStone1(row, column);
					ge.printCheckerBoard();
					if(ge.fivRowCheck()) {
						System.out.println("게임 끝! 플레이어1 승리!");
//						플레이어1 승/패 누적
						ge.player1Win++;
						ge.player2Lose++;
						now = false;
					}
				}
				break;
			}  // 플레이어1 while 끝
			
//			돌이 연속으로 5개가 없을경우 플레이어2 차례 돌아옴
			if(ge.fivRowCheck() == false) {  // 플레이어2 if 시작
				System.out.println("플레이어2 - 놓을 위치를 입력하세요.");
				while(true) {  // 플레이어2 while 시작
					System.out.println("세로(1~13) >>");
					int row = scan.nextInt();
					System.out.println("가로(1~13) >>");
					int column = scan.nextInt();
					
//				13 초과 예외처리 메서드 호출
//				isCheckPostion(행, 열) 의 벗어남. false
					if(!ge.isCheckPostion(row, column)) {
						System.out.println("범위를 벗어났습니다. 다시 입력하세요.");
						continue;
					}
					
//				중복 예외처리
					if(ge.checkerBoard[column-1][row-1].equals("★") || ge.checkerBoard[column-1][row-1].equals("☆")) {
						System.out.println("이미 놓여진 자리입니다. 다시 입력하세요.");
						
//				중복되지 않아서 돌 올려놓을거임
					}else {
						ge.placeStone2(row, column);
						ge.printCheckerBoard();
						
						if(ge.fivRowCheck()) {
							System.out.println("게임 끝! 플레이어2 승리!");
//						플레이어2 승/패 누적
							ge.player2Win++;
							ge.player1Lose++;
							now = false;
						}
						break;
					}
				}  // 플레이어2 while 끝
			}  // 플레이어2 if 끝
		}  // 전체 while 끝
	}  // 게임 플레이 메서드 끝
	
//	전적 메서드
	public void showGameRecord() {
		System.out.println("플레이어1 : " + ge.player1Win + "승 " + ge.player1Lose + "패");
		System.out.println("플레이어2 : " + ge.player2Win + "승 " + ge.player2Lose + "패");
	}
}
