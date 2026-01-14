package omok;

import java.util.*;

public class Game {
//	while 변수
	boolean win = true;
	
//	플레이어 별 승리 횟수 누적
	int p1 = 0;  // 플레이어1 
	int p2 = 0;  // 플레이어2
	
//	게임종료 확인 변수
// 	플레이중 = 0 / 종료 -> 플레이어1 승리 = -1, 플레이어2 승리 = -2	
	int state = 0;
	
	Scanner scan = new Scanner(System.in);
	
//	객체화
	GameElements GE = new GameElements();
	
	public Game() {}

//	오목판 출력 메서드
	public void gamePan() {
		for(int i = 0; i < GE.omok.length; i++) {
			for(int j = 0; j < GE.omok[i].length; j++) {
				GE.omok[i][j] = "- ";
				System.out.print(GE.omok[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	
//	게임 플레이 메서드
	public void play() {
		for(int i = 0; i < GE.omok.length; i++) {
			for(int j = 0; j < GE.omok[i].length; j++) {
				if(GE.omok[i][j].equals("● ") && i == j) {
					state = -1;
				}else if(GE.omok[1][1].equals("○ ")){
					state = -2;
				}else {
					System.out.println("플레이어1 - 놓을 위치를 입력하세요. \n가로(1~13) >>");
					int player1_garo = scan.nextInt();
					System.out.println("세로(1~13) >>");
					int player1_sero = scan.nextInt();
					
//					중복된 자리 예외처리
					if(GE.omok[player1_garo - 1][player1_sero - 1] == "○ " || GE.omok[player1_garo - 1][player1_sero - 1] == "● ") {
						System.out.println("이미 놓여진 자리입니다.");

//					정상입력
					}else {
						GE.omok[player1_garo - 1][player1_sero - 1] = "● ";

						for(int k = 0; k < GE.omok.length; k++) {
							for(int l = 0; l < GE.omok[k].length; l++) {
								System.out.print(GE.omok[k][l]);
							}
							System.out.println();
						}
						System.out.println();
					}
					
					System.out.println("플레이어2 - 놓을 위치를 입력하세요. \n가로(1~13) >>");
					int player2_garo = scan.nextInt();
					System.out.println("세로(1~13) >>");
					int player2_sero = scan.nextInt();
					
//					중복된 자리 예외처리
					if(GE.omok[player2_garo - 1][player2_sero - 1] == "● " || GE.omok[player2_garo - 1][player2_sero - 1] == "○ ") {
						System.out.println("이미 놓여진 자리입니다.");
						
//					정상입력
					}else {
						GE.omok[player2_garo - 1][player2_sero - 1] = "○ ";

						for(int k = 0; k < GE.omok.length; k++) {
							for(int l = 0; l < GE.omok[k].length; l++) {
								System.out.print(GE.omok[k][l]);
							}
							System.out.println();
						}
						System.out.println();
					}
				}
			}
		}
	}
	
//	메뉴 출력 메서드
	public void menu() {
		boolean now = true;
		
		while(now) {
			System.out.println("[오목]\n[1]게임시작\n[2]전적확인\n[0]종료\n메뉴선택 >> ");
			int menuChoice = scan.nextInt();
			
			if(menuChoice == 1) {
				System.out.println("게임시작!\n플레이어1 : ●(흑돌) / 플레이어2 : ○(백돌)");
				gamePan();  //오목판 출력
				while(win) {
					play();  // 게임 플레이
					if(state == -1) {
						System.out.println("게임 끝! 플레이어1 승리!\n");
						p1++;  // 승리횟수 누적
						now = false;  // while 종료
					}else {
						System.out.println("게임 끝! 플레이어2 승리!\n");
						p2++;  // 승리횟수 누적
						now = false;  // while 종료
					}
				}
				
//			전적확인
			}else if(menuChoice == 2) {
				System.out.println("플레이어 1 : " + p1 + "승 " + p2 + "패");
				System.out.println("플레이어 2 : " + p2 + "승 " + p1 + "패\n");
				
//			게임종료
			}else if(menuChoice == 0) {
				System.out.println("게임종료");
				now = false;
				
//			예외처리
			}else {
				System.out.println("메뉴를 다시 확인하세요.");
			}
		}
	}
}
