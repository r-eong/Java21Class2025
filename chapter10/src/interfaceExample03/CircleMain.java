package interfaceExample03;

public class CircleMain {

	public static void main(String[] args) {
		CircleInterface c = new CircleClass();
		
		c.redraw();
		System.out.println(c.getArea());
	}

}
