package diExample04;

public class ShapeCalculator {
	public void shapecalculator(String name, Shape shape) {
		Double cal = shape.shapecal(name);
		System.out.println(name + "의 면적 : " + cal);
	}
}
