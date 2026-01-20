package diExample04;

public class Circle implements Shape {
	double num1;
//	double num2;
	
	public Circle(double num1) {
		this.num1 = num1;
//		this.num2 = 3.14;
	}
	
	@Override
	public double shapecal(String name) {
		return (num1 * num1) * 3.14;
	}
}
