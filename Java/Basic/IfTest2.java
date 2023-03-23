package day02;

import java.util.*;

public class IfTest2 {
	//main()메서드:JVM이 호출한다
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("2자리의 정수를 입력하세요=>");
		int num = sc.nextInt();
		if(num<10||num>99) {
			System.out.println("2자리 정수를 입력해야 해요!!");
			return;
			//return문을 가지고 있는 메서드를 호출한 쪽으로 되돌아간다
		}

		// 2자리 정수를 입력받으세요
		// 11, 22, 33, 44, 55,...
		// ==> "OK 10의 자리와 1의 자리가 같아요"
		// 그렇지 않다면 "No 10의 자리와 1의 자리가 달라요"
		// [1] if ~ else

		// [2] 삼항연산자로

		//if (num % 11 == 0) {
		if(num/10 == num%10) {
			System.out.println("OK 10의 자리와 1의 자리가 같아요");
		} else {
			System.out.println("No 10의 자리와 1의 자리가 달라요");
		}

		String str = (num % 11 == 0) ? "OK 10의 자리와 1의 자리가 같아요" : "No 10의 자리와 1의 자리가 달라요";
		System.out.println(str);

	}

}
