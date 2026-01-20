package diExample04;

public class Rectangle implements Shape {
	double num1;
	double num2;
	
	public Rectangle(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public double shapecal(String name) {
		return num1 * num2;
	}
}
