package inheritance03;

public class BollPen extends ShapPencil {
	protected String color;
	
	public BollPen() {}
	
	public BollPen(String name, int count, int thickness, String color) {
		super.name = name;
		super.count = count;
		super.thickness = thickness;
		this.color = color;
	}
	
	@Override
	
	public void print() {
		super.print();
		System.out.println(", 색상 : " + color);
	}
}
