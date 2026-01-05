package multiexample;

import java.util.*;

public class MutiArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int[][] arr = new int[3][3];
		
//		<문제5>
//		System.out.println("문제5");
//		
//		int cnt5 = 1;  // 누적
//		int tot5 = 0;  // 총계
//		
//		System.out.println("인덱스 1 >>");
//		int numX = scan.nextInt();
//		System.out.println("인덱스 2 >>");
//		int numY = scan.nextInt();
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = cnt5 * 10;
//				cnt5++;
//				
//				if(arr[i] == arr[numX] && arr[j] == arr[numY]) {
//					System.out.println(arr[i][j]);
//				}
//			}
//		}
		System.out.println();
		
//		문제6
		System.out.println("문제6");
		
//		int cnt6 = 1;  // 누적
//		int tot6 = 0;  // 총계
//		
//		System.out.println("인덱스 1 >>");
//		int numX1 = scan.nextInt();
//		System.out.println("인덱스 2 >>");
//		int numY1 = scan.nextInt();
//		
//		int result1 = 0;
//		int result2 = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				arr[i][j] = cnt6 * 10;
//				cnt6++;
//				
//				if(arr[i] == arr[numX1] && arr[j] == arr[numY1]) {
//					System.out.println(arr[i][j]);
//					arr[i][j] = result1;
//				}
//				
//			}
//		}
//		System.out.println("변경할 인덱스 1 >>");
//		int numX2 = scan.nextInt();
//		System.out.println("변경할 인덱스 2 >>");
//		int numY2 = scan.nextInt();
//		for(int i = 0; i < arr.length; i++) {
//			for(int j = 0; j < arr[i].length; j++) {
//				
//				if(arr[i] == arr[numX2] && arr[j] == arr[numY2]) {
//					System.out.println(arr[i][j]);
//					arr[i] = arr[numX2];
//					arr[j] = arr[numY2];
//				}
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		int cnt1 = 1;  // 누적

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt1 * 10;
				cnt1++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
//		두 값을 입력받아 그 값들의 위치를 찾아 서로 값을 교환
		System.out.println("-----------------------");
		System.out.println("값1 >>");
		int num1 = scan.nextInt();
		System.out.println("값2 >>");
		int num2 = scan.nextInt();
		
//		값의 인덱스 위치를 찾을 변수 4개 선언
		int n1idx = 0;
		int n2idx = 0;
		int n3idx = 0;
		int n4idx = 0;
		
//		값을 교환하기 위해서 임기 기억 장소 temp 지정
//		값을 교환할 때 빈 바구니 역할
		int temp = 0;

//		내가 입력한 인덱스 값을 찾는 코드
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(num1 == arr[i][j]) {
					n1idx = i;
					n2idx = j;
				}
				if(num2 == arr[i][j]) {
					n3idx = i;
					n4idx = j;
				}
			}
		}
		
//		찾은 값들을 서로 교환
//		temp = 0 -> temp = 60
//		자료구조 stack 이용한 로직
		temp = arr[n1idx][n2idx];
		arr[n1idx][n2idx] = arr[n3idx][n4idx];
		arr[n3idx][n4idx] = temp;
		
//		값 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}