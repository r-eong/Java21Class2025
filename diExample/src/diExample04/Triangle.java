package diExample04;

public class Triangle implements Shape {
	double num1;
	double num2;
	
	public Triangle(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@Override
	public double shapecal(String name) {
		return (num1 * num2) / 2;
	}
}
