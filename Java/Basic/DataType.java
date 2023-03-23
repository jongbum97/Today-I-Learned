package day02;
/* 변수가 선언된 위치따른 변수 유형
 * [1] 멤버변수 : 초기화하지 않으면 default값이 들어간다.
 * 		<1> non-static변수: 인스턴스 변수  "객체명.변수" 식으로 접근한다
 * 		<2> static 변수   : 클래스 변수	   "클래스명.변수" 식으로 접근한다
 * [2] 지역변수 : 초기화하지 않고 사용하면 에러 발생한다
 * 
 * */
public class DataType {
	
		   byte b; //멤버변수(member variable)-인스턴스변수
	static byte c=9;//멤버변수-클래스변수
		   short s;//0
		   char ch;//'\u0000'
		   int i;//0
		   long l;//0L
	static float f;//0.0f
		   double d;//0.0
		   boolean bool;//false
	static String str;//참조형 null
		   Object obj;//null

	public static void main(String[] args) {
		int k=5;//지역변수(local variable):초기화한 뒤 사용해야 함
		System.out.println("DataType.c: "+DataType.c);
		//System.out.println(b); [x]
		
		//객체 생성
		DataType dt=new DataType();//dt :객체명
		System.out.println("dt.b: "+dt.b);
		
		System.out.println("k: "+k);
		//s, ch, i, l, f, d, bool, str값을 출력하세요
		System.out.println(dt.s);
		System.out.println(dt.ch);
		System.out.println(dt.i);
		System.out.println(dt.l);
		System.out.println(DataType.f);
		System.out.println(dt.d);
		System.out.println(dt.bool);
		System.out.println(DataType.str);
		System.out.println(dt.obj);
	}

}
