package otOmok;

public class GameElements {
	int player1Win = 0;  // 플레이어1 승
	int player1Lose = 0;  // 플레이어1 패
	int player2Win = 0;  // 플레이어2 승
	int player2Lose = 0;  // 플레이어2 패
	
//	가로세로 크기 13*13배열
	String[][] checkerBoard = new String[13][13];
	
//	오목판 크기를 벗어나는 예외처리 메서드
	public boolean isCheckPostion(int row, int column) {
		return row >= 1 && row <= 13 && column >= 1 && column <= 13;
	}
	
//	게임 끝나고 새 게임 시작할 때 메서드
	public void setCheckBoard() {
		for(int i = 0; i < checkerBoard.length; i++) {
			for(int j = 0; j < checkerBoard[i].length; j++) {
				checkerBoard[i][j] = "-";
			}
		}
	}
	
//	오목판 출력 - 돌하나 놓을때마다
	public void printCheckerBoard() {
		System.out.println();
		for(int i = 0; i < checkerBoard.length; i++) {
			for(int j = 0; j < checkerBoard[i].length; j++) {
				System.out.print(checkerBoard[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
//	플레이어1 - 흑
	public void placeStone1(int row, int column) {
		checkerBoard[column - 1][row - 1] = "★";
	}
	
//	플레이어2 - 백
	public void placeStone2(int row, int column) {
		checkerBoard[column - 1][row - 1] = "☆";
	}
	
//	오목 기본규칙
//	→ ↓ ↗ ↘ 연속으로 5개 놓아지면 승리 를 체크
	public boolean fivRowCheck() {
		int check = -1;
		
//		흑 또는 백이 같은 돌을 연속으로 5개 놓았는지 확인
//		→
		for(int i = 0; i < checkerBoard.length; i++) {
			for(int j = 0; j < checkerBoard[i].length-4; j++) {
				if( (checkerBoard[i][j].equals("★") && 
					checkerBoard[i][j+1].equals("★") && 
					checkerBoard[i][j+2].equals("★") && 
					checkerBoard[i][j+3].equals("★") && 
					checkerBoard[i][j+4].equals("★")) 
					|| (checkerBoard[i][j].equals("☆") && 
					checkerBoard[i][j+1].equals("☆") && 
					checkerBoard[i][j+2].equals("☆") && 
					checkerBoard[i][j+3].equals("☆") && 
					checkerBoard[i][j+4].equals("☆")) ) {
					check = i;
				}
			}
		}
		
//		↓
		for(int i = 0; i < checkerBoard.length-4; i++) {
			for(int j = 0; j < checkerBoard[i].length; j++) {
				if( (checkerBoard[i][j].equals("★") && 
						checkerBoard[i+1][j].equals("★") && 
						checkerBoard[i+2][j].equals("★") && 
						checkerBoard[i+3][j].equals("★") && 
						checkerBoard[i+4][j].equals("★")) 
						|| (checkerBoard[i][j].equals("☆") && 
						checkerBoard[i+1][j].equals("☆") && 
						checkerBoard[i+2][j].equals("☆") && 
						checkerBoard[i+3][j].equals("☆") && 
						checkerBoard[i+4][j].equals("☆")) ) {
					check = i;
				}
			}
		}
		
//		↘
		for(int i = 0; i < checkerBoard.length-4; i++) {
			for(int j = 0; j < checkerBoard[i].length-4; j++) {
				if( (checkerBoard[i][j].equals("★") && 
						checkerBoard[i+1][j+1].equals("★") && 
						checkerBoard[i+2][j+2].equals("★") && 
						checkerBoard[i+3][j+3].equals("★") && 
						checkerBoard[i+4][j+4].equals("★")) 
						|| (checkerBoard[i][j].equals("☆") && 
						checkerBoard[i+1][j+1].equals("☆") && 
						checkerBoard[i+2][j+2].equals("☆") && 
						checkerBoard[i+3][j+3].equals("☆") && 
						checkerBoard[i+4][j+4].equals("☆")) ) {
					check = i;
				}
			}
		}
		
//		↗
		for(int i = 4; i < checkerBoard.length; i++) {
			for(int j = 0; j < checkerBoard[i].length-4; j++) {
				if( (checkerBoard[i][j].equals("★") && 
						checkerBoard[i-1][j+1].equals("★") && 
						checkerBoard[i-2][j+2].equals("★") && 
						checkerBoard[i-3][j+3].equals("★") && 
						checkerBoard[i-4][j+4].equals("★")) 
						|| (checkerBoard[i][j].equals("☆") && 
						checkerBoard[i-1][j+1].equals("☆") && 
						checkerBoard[i-2][j+2].equals("☆") && 
						checkerBoard[i-3][j+3].equals("☆") && 
						checkerBoard[i-4][j+4].equals("☆")) ) {
					check = i;
				}
			}
		}
		
		if(check == -1) {
			return false;
		}else {
			return true;
		}
	}
}
