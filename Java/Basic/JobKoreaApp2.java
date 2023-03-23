package day04;

public class JobKoreaApp2 {

	public static void main(String[] args) {
		Company c1=new Company();//생성자 호출
		c1.info();

		c1.name="네이버";
		c1.year=1980;
		c1.employees=1000;
		c1.info();
	}

}
