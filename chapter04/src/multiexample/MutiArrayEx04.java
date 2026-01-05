package multiexample;

public class MutiArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("문제8");
		int[][] apt = {
				{101, 102, 103},
				{201, 202, 203},
				{301, 302, 303}
		};
		int[][] pay = {
				{1000, 2100, 1300},
				{4100, 2000, 1000},
				{3000, 1600, 800}
		};
		
		for(int i = 0; i < apt.length; i++) {
			int price = 0;
			for(int j = 0; j < apt[i].length; j++) {
					price += pay[i][j];
			}
			System.out.print(price + "원 ");
		}
	}

}
