package inheritance02;

public class Main {

	public static void main(String[] args) {
		ColorTV cv = new ColorTV(32, 1024);
		IPTV it = new IPTV("192.1.1.2", 32, 2048);
		
		cv.printColortv();
		it.printColortv();
	}

}
