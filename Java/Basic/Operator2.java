package day02;

public class Operator2 {
	
	//main()
	public static void main(String[] args) {
		System.out.println("논리부정 연산자(!) -----------");
		//논리식,논리값에만 사용된다. true=>false, false=>true
		boolean b1=false;
		print("b1="+b1);
		print("!b1="+(!b1));
		print("!(2<4)="+(!(2<4)));
		/* = : 대입연산자
		 * == : 비교연산자
		 * ===: 자바에는 없음[x]
		 * 비교연산자(==)
		 *   [1] 기본자료형 : 값이 같은지를 비교한다
		 *   [2] 참조형 : 주소값이 같은지를 비교한다
		 * 
		 *   != : 
		 *    [1] 기본자료형: 값이 다른가? 다르면 true, 같으면 false
		 *    [2] 참조형	: 주소값이 다른가?
		 * */	
		int x=5;
		float y=5.1f;
		print("x==y: "+(x==y)); //값을 비교
		print("x!=y: "+(x!=y));
		
		String s1="Hello";//literal pool
		String s2=new String("Hello");//heap
		
		print("s1==s2: "+(s1==s2));//주소값을 비교함
		print("s1!=s2: "+(s1!=s2));
		
		//String의 메서드
		//public boolean equals(Object o): 문자열의 내용을 비교한다
		//문자열 내용이 같으면 true반환하고, 내용이 다르면 false를 반환함
		boolean bool=s1.equals(s2);
		print("s1.equals(s2): "+bool);//문자열 내용 비교
		print("!s1.equals(s2): "+(!s1.equals(s2)));
		print("!bool: "+(!bool));
		
	}//main()
	
	public static void print(String str) {
		System.out.println(str);
	}//print()

}//class/////////////////////////////
