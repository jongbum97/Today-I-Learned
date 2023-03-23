package day05;

public class Teacher {
	private int no;
	private String name;
	private String subject;
	
	public void setNo(int no) {
		this.no=no;
	}
	public void setName(String name) {
		this.name=name;
	}
	public void setSubject(String subject) {
		this.subject=subject;
	}
	
	public int getNo() {
		return this.no;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	
	public void showInfo() {
		System.out.println("----교사 정보----------");
		System.out.printf("교 번: %d%n", getNo());
		System.out.printf("이 름: %s%n", getName());
		System.out.printf("과 목: %s%n", getSubject());
	}

}
