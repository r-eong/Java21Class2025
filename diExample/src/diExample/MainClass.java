package diExample;

public class MainClass {

	public static void main(String[] args) {
		MyCal mc = new MyCal();  //객체화
		
//		mc.add(20, 10);
//		mc.sub(20, 10);
//		mc.mul(20, 10);
//		mc.div(20, 10);
		
		mc.allCal(20, 10, new AddClass());
		mc.allCal(20, 10, new SubClass());
		mc.allCal(20, 10, new MulClass());
		mc.allCal(20, 10, new DivClass());
	}

}