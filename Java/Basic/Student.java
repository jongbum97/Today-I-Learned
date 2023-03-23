package day05;

public class Student {
	
	private int no;//인스턴스변수
	private String name;
	private String className;
	
	public void setNo(int no) {
		//지역변수와 멤버변수의 이름이 같을 경우에는 지역변수가 우선이다.
		//이것을 구분하기 위해 멤버변수 앞에는 "this.변수"을 명시적으로 붙여준다
		//this.변수 : 자기 객체의 인스턴스 변수를 참조할때 this를 붙인다
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setClassName(String className) {
		this.className=className;
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getClassName() {
		return className;
	}
	public void showInfo() {
		System.out.println("----학생 정보----------");
		System.out.printf("학 번: %d%n", getNo());
		System.out.printf("이 름: %s%n", getName());
		System.out.printf("학급명: %s%n", getClassName());
	}

}
