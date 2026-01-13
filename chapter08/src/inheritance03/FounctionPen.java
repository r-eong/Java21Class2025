package inheritance03;

public class FounctionPen extends BollPen {
	public FounctionPen() {}
	
	public FounctionPen(String name, int count, int thickness, String color) {
		super.name = name;
		super.count = count;
		super.thickness = thickness;
		super.color = color;
	}
	
	@Override
	
	public void print() {
		super.print();
	}
}
