package multiexample;

public class MutiArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];

		
//		<문제1>
		System.out.println("문제1");
		
		int cnt1 = 1;  // 누적
		int tot1 = 0;  // 총계
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt1 * 10;
				cnt1++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
//		문제2
		System.out.println("문제2");
		
		int cnt2 = 1;  // 누적
		int tot2 = 0;  // 총계
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt2 * 10;
				cnt2++;
//				System.out.print(arr[i][j] + " ");
				tot2 += arr[i][j];	
			}
		}
		System.out.println("\n합 : " + tot2);
		System.out.println();
		
//		문제3
		System.out.println("문제3");
		
		int cnt3 = 1;  // 누적
		int tot3 = 0;  // 총계
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = cnt3 * 10;
				cnt3++;
				if(arr[i][j] % 4 == 0) {
					System.out.println(arr[i][j]);
				}
			}
		}
	}
}