package inheritance03;

public class Main {

	public static void main(String[] args) {
		ShapPencil sp = new ShapPencil("ShapPencil", 10, 1);
		BollPen bp = new BollPen("BollPen", 25, 2, "Black");
		FounctionPen fp = new FounctionPen("FounctionPen", 15, 2, "Blue");
		
		sp.print();
		System.out.println();
		bp.print();
		fp.print();
	}

}
