package interfaceExample02;

public class Chicken implements Animal {

	@Override
	public void eat(String bab) {
		System.out.print(bab);
	}

	@Override
	public void work(String move) {
		System.out.print(move);
	}

	@Override
	public void sleep(String zzz) {
		System.out.print(zzz);
	}
	
}
