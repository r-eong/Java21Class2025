package inheritance02;

public class TV {
	protected int size;  // 인치
	
//	기본 생성자
	public TV() {}

//	매개변수 생성자
	public TV(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		if(size > 0) {  // 안해도됨!
			this.size = size;
		}
	}
}
