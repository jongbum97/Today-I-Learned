package day01;

public class Primitive3 {
	
	//main()
	public static void main(String[] args) {
		System.out.println("1. 문자형(char)-----------");
		//character(문자형) : char (2byte -16bit): 0 ~ 2^16-1 (0~65535)
		//					자바는 유니코드 체계를 사용함(모든 국각의 언어를 표현할 수 있다)
		char ch1='가';
//		char ch2='가나다';//[x]
		String str="가나다";
		char ch2='W';
		
		print("ch1="+ch1);
		print("ch2="+ch2);
		
		char ch3='\uff57';//W
		print("ch3="+ch3);
		
		char c='A';//아스키코드: A(65), B(66)
		print("c+1="+(c+1));//66
		//char + int ==> 큰 자료유형으로 promotion됨
		
		//66을 문자로 출력하려면
		int n=c+1;
		print("n="+n);
		/*
		 *  ====================>자동형변환(promotion)
		 * byte< short <int < long < float <double
		 * 		char
		 * 
		 *    <================= 강제형변환(casting)
		 * */
		char c2=(char)n;
		//강제형변환(casting) : 큰 자료유형에서 작은 자료유형으로 변환하고자 할때 사용한다.
		//			형변환 연산자()를 사용해야한다
		//	자료형  변수 = (자료형) 큰값
		print("c2="+c2);
		
		byte b1=10;
		byte b2=20;
		//byte b3=b1+b2; [x]
		int b3=b1+b2;
		/* int보다 작은 유형의 데이터가 연산에 사용될 경우
		 * 자동으로 int유형으로 형변환된다.
		 * */
		print("b3="+b3);
		
		char c1='G';
		char cc2='P';
		char c3='X';
		
		System.out.println(c1+cc2+c3);//GPX==239\
		//char +char => int
		
		byte b4=(byte)(b1+b2);
		//강제형변환해보기
		print("b4="+b4);
		
		print("4. 논리형(boolean)----------");
		boolean bool1=true;
		boolean bool2=false;
		boolean bool3=7>3;
		print("bool1="+bool1);
		print("bool2="+bool2);
		print("bool3="+bool3);
		//c언어는 false=>0, true=>1로 호환해서 사용
		//java는 0,1로 호환되지 않는다. 형변환도 불가능함
	}
	
	public static void print(String str) {
		System.out.println(str);
	}

}
