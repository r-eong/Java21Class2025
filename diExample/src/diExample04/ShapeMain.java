package diExample04;

public class ShapeMain {

	public static void main(String[] args) {
		ShapeCalculator sc = new ShapeCalculator();
		
		sc.shapecalculator("원", new Circle(5));
		sc.shapecalculator("사각형", new Rectangle(9, 5));
		sc.shapecalculator("삼각형", new Triangle(3, 7));
	}

}
