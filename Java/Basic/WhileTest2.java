package day03;
//C:\myjava\Workspace\Begin\bin>java day03.WhileTest2 99 77
//args[0]=99
//args[1]=77
public class WhileTest2 {

	public static void main(String[] args) {
		//명령줄 인수 2개를 받아 더하기를 해보세요
		String num1=args[0];
		String num2=args[1];
		System.out.printf("%s + %s = %s%n",num1, num2, num1+num2);//문자열 결합
		//java.lang.Integer클래스
		//public static int parseInt(String s) 를 이용해서 제대로된 덧셈식을 출력하세요
		
		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);
		System.out.printf("%d +%d = %d%n", n1,n2,n1+n2);
		
		
	}

}
