package interfaceExample01;

public class Main {

	public static void main(String[] args) {
		Buyable t = new Television("MV-2020", "TV-samsung", 509000);
		
		System.out.println("--- " + t.getName() + " 정보 ---");
		System.out.println("메이커 : " + t.getMaker());
		System.out.println("모델명 : " + t.getModel());
		System.out.println("금액 : " + t.getPrice());
		
//		------------------------------
		
		Buyable r = new Refrigerator("MV-2020", "1등급", 2000000);
		
		System.out.println("--- " + r.getName() + " 정보 ---");
		System.out.println("효율성 등급 : " + r.getMaker());
		System.out.println("모델명 : " + r.getModel());
		System.out.println("금액 : " + r.getPrice());
		
//		------------------------------------
		
//		배열로 돌리는 방법
		
		Buyable[] by = {t, r};
		
		for(int i = 0; i < by.length; i++) {
			System.out.println("--- " + by[i].getName() + " 정보 ---");
			System.out.println("메이커 / 효율성 등급 : " + by[i].getMaker());
			System.out.println("모델명 : " + by[i].getModel());
			System.out.println("금액 : " + by[i].getPrice());
		}
	}

}
