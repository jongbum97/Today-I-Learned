package day04;
/*
 * static메서드 안에서 접근가능한 변수
 * 		static 변수[o] "클래스명.변수", static 메서드 [o]
 * 	    인스턴스 변수[x], 인스턴스 메서드 [x]
 * 			=>객체를 먼저 생성해서 객체명.변수, 객체명.메서드()
 *            식으로 접근해야 함
 * 
 * */
public class YourDemoTest {
	
		   boolean z=true;
	static boolean r=false;

	public static void main(String[] args) {
		//YourDemo를 생성하고
		//str, pi값 출력하세요
		YourDemo yd=new YourDemo();
		
		System.out.println("yd.str:  "+yd.str);
		System.out.println("yd.pi: "+yd.pi);
		
		//CMD값도 출력하세요
		System.out.println(YourDemo.CMD);
		System.out.println(yd.CMD);

		//r값 출력하기
		System.out.println("r: "+YourDemoTest.r);
		System.out.println("r: "+r);
		//z값 출력하기
		YourDemoTest ydt=new YourDemoTest();
		
		//System.out.println("z: "+z); [x]
		System.out.println("ydt.z: "+ydt.z);
	}

}
