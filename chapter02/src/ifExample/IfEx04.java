package ifExample;

import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 : ");
		int height = scan.nextInt();
		
		if(height < 120) {
			System.out.println("부모님과 함께 오셨나요? (yes : 1, no = 0) : ");
			int YorN = scan.nextInt();
			if(YorN == 1) {
				System.out.println("놀이기구 이용 가능합니다.");
			}else {
				System.out.println("놀이기구 이용이 불가능합니다.");
			}
		}else {
			System.out.println("놀이기구 이용 가능합니다.");
		}
	}

}
