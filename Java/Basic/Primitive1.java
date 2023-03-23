package day01;

public class Primitive1 {
	//저장: Ctrl+S ==> 저장하면 자동으로 컴파일이 된다
	//실행: Ctrl+F11
	//주석처리/해제: Ctrl+/
	//커서 라인 삭제: Ctrl+D
	public static void main(String[] args) {
		System.out.println("1. 기본 자료형(정수형)------------");
		//정수형: byte < short < int [*] < long
		byte bt1=-128; // -128~ 127사이값 저장 가능
		byte bt2=127;
		System.out.println("bt1="+bt1);
		System.out.println("bt2="+bt2);
		short bt3=128; //short(2byte) : -2^15 ~ 2^15-1
		System.out.println("bt3="+bt3);
		short st1=25000;
		System.out.println("st1="+st1);
		
		int it1=5000000;//int(4byte-32bit) -2^31 ~ 2^31-1
		System.out.println("it1="+it1);
		
		long ln1=40; //long(8byte-64bit) -2^63 ~ 2^63-1
		long ln2=40L;//뒤에 접미사 L, l 을 붙인다.
		System.out.printf("ln1=%d%n", ln1);
		System.out.printf("ln2=%d%n", ln2);
		
		int i=1000000000;//0이 9개
		long j=10000000000L;//0이 10개  int형의 최대값: 2147483647
		System.out.println("i="+i);
		System.out.println("j="+j);
		//Ctrl+Alt+방향키아래 : 현재 커서내용을 복붙함
		
		int a1=010;//8진수의 정수. 8진수는 앞에 0을 붙인다(접두어:0)
		int a2=0x1ac;//16진수 정수 앞에 0x를 붙인다 0 ~ 9,a,b,c,d,e,f
		//1*16^2 + 10*16 +12
		System.out.println("a1="+a1);
		System.out.println("a2="+a2);
		
		
	}

}
