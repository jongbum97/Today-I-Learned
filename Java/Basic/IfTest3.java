package day02;
import java.util.Scanner;

public class IfTest3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		/*[2]
		가격과 나이를 입력받아 20세 미만이면 10%를 할인하여 가격을 알려주세요
		
		price=10000
		age=18
		가격은 9000원 입니다
		*/
//		System.out.println("나이를 입력=>");
//		int age=sc.nextInt();
//		System.out.println("정가를 입력=>");
//		int price=sc.nextInt();
//		
//		if(age<20) {
//			System.out.println("가격은 "+(int)(price*0.9)+"원 입니다");			
//		}else {
//			System.out.println("가격은 "+price+"원 입니다");
//		}
		
		System.out.println("***********************");
		System.out.println("0~9999사이의 정수를 입력하세요=>");		
		int num = sc.nextInt();
		
		int result = 1;
		if(num/1000>0)
			result = 4;
		else if(num/100>0)
			result = 3;
		else if(num/10>0)
			result = 2;
		System.out.println("결과:"+result+"자리수 입니다.");
		
		/*if(num>=0 && num<10) {
			result=1;
		}else if(num>=10&&num<100) {
			result=2;
		}*/
		
		
		System.out.println(num+"->"+String.valueOf(num).length());
		/*[3]
		 * 0~9999 사이의 정수를 입력받아서 입력받은 정수가 몇 자리인지 알려주세요.
			 15 --->2  
			 123--->3  
			 7777-->4
		 * */

	}

}
