package multiexample;

public class MutiArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제7");
		int[][] arr = {
			{101, 102, 103, 104},
			{201, 202, 203, 204},
			{301, 302, 303, 304}
		};

		System.out.println("1) 가로 합");
		for(int i = 0; i < arr.length; i++) {
			int tot1 = 0;  // 총계
			for(int j = 0; j < arr[i].length; j++) {
				tot1 += arr[i][j];
			}
			System.out.print(tot1 + " ");
		}
		
		System.out.println();
		
		int[] col = new int[4]; 
		System.out.println("2) 세로 합");
		
		for(int i = 0; i < arr.length; i++) {
			//int tot1 = 0;  // 총계
			for(int j = 0; j < arr[i].length; j++) {
				// j=0, i=0
				// j=1 i=1
//				 System.out.println(j + " " + i);
				col[j] += arr[i][j];
			}
			//System.out.println(tot1);
		}

		//세로의 합을 출력하는 코드
		for(int k=0; k<arr[0].length; k++) {
			 System.out.print(col[k]+" ");
		}
	}

}
