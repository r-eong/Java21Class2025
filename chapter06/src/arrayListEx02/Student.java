package arrayListEx02;

import java.util.ArrayList;

public class Student {
//	학생
	
//	멤버변수
	String name;
	
//	Subject 받아오기
//	ArrayList<Subject> subLIst = new ArrayList<Subject>();
	ArrayList<Subject> subLIst;  // 이 방법 추천

//	기본 생성자
//	public Student() {}
	
//	매개변수
	public Student() {
		new ArrayList<Subject>();
	}
}
