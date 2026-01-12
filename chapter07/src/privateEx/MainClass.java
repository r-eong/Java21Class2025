package privateEx;

public class MainClass {

	public static void main(String[] args) {
		PrivateTest pT = new PrivateTest();
		
//		System.out.println(pT.day = 10);
//		System.out.println(pT.month = 20);
//		System.out.println(pT.year = 2005);
		
//		먼저 setter() 값을 수정
		pT.setMonth(2);
		pT.setDay(30);
		pT.setYear(2026);
		
//		수정은 불가능하고 출력은 getter()
//		System.out.println(pT.getDay());
	}

}
