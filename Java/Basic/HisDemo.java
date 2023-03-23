package day04;

public class HisDemo {
	
	public void foo() {
		System.out.println("---foo()-----");
	}
	public static void bar() {
		System.out.println("****bar()*****");
	}
	
	//메서드 2개 구성하기 매개변수를 받는 메서드
	public String showChar(char ch, int num) {
		String str="";
		for(int i=0;i<num;i++) {
			str+=ch;
		}
		return str;
	}
	public static long giveMe(int money) {
		System.out.println("giveMe() input money: "+money);
		return 3*money;
	}
	public static void main(String[] args) {
		//bar()호출해보기
		HisDemo.bar();
		//foo()호출해보기
		bar();
		HisDemo hd=new HisDemo();
		hd.foo();//[x]
		
		new HisDemo().foo();
		
		//showChar()
		String s=hd.showChar('★',8);
		System.out.println(s);
		System.out.println(hd.showChar('@', 10));
		
		//giveMe()
		long b=giveMe(10000);
		System.out.println(b);
		
		b=HisDemo.giveMe(50000);
		System.out.println(b);
	}

}
