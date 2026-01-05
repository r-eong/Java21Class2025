package multiexample;

public class MultiArrTest {
	public static void main(String[] args) {
//		다차원 배열 선언 및 초기화
//		int[][] score = new int[3][]
//		score[0] = int new int[2];
//		↓
		int[][] score= {
				{95, 60},
				{50, 50, 80},
				{100, 75, 89, 68, 59}
		};
		
//		score 값 출력
//		다차원 배열은 출력시 다중 for문을 이용한다
//		score.length : 행의 갯수를 의미
//		score[i].length : 열의 갯수를 의미
		for(int i = 0; i < score.length; i++) {
//			i = 0 일때 j는 2번 돈다 <- {95, 60}
//			i = 1 일때 j는 3번 돈다 <- {50, 50, 80}
//			i = 2 일때 j는 5번 돈다 <- {100, 75, 89, 68, 59}
			for(int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + " ");
			}
			System.out.println();
		}
	}
}
