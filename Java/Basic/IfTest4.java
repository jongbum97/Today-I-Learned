package day02;

import javax.swing.JOptionPane;

public class IfTest4 {

	public static void main(String[] args) {
		String str = JOptionPane.showInputDialog("0~9, 또는 알파벳 또는 기타문자 1개를 입력하세요");
		// let str=prompt("0~9, 또는 알파벳 또는 기타문자 1개를 입력하세요");
		System.out.println("str: " + str);
		// String클래스의 메서드
		// public char charAt(int index): 특정 index위치의 문자를 1개 추출하여 반환하는 메서드
		// System.out.println("Hello".charAt(1));
		// 입력한 값의 첫번째 문자1개 0~9사이의 값이면 "숫자입니다"
		// "A~Z" or "a-z" 이면 "알파벳입니다"
		// 그 외 문자이면 "기타 문자입니다"를 출력하세요
		if (str == null) {
			System.out.println("0~9, 또는 알파벳 또는 기타문자 1개를 입력해야 해요");
			return;
		}
		char i = str.charAt(0);
		if(i>='0' && i <='9')
			System.out.println("숫자에요");
		else if ((i>='A'&& i<='Z')||('a'<=i && i<='z'))
			System.out.println("알파벳이에요");
		else
			System.out.println("기타문자에요");
		
		System.out.println("Character.isAlphabetic(): "+Character.isAlphabetic(i));
		
		//java.lang.Character클래스의 메서드를 이용해서 이 문제를 풀어봅시다.
		//static boolean	isAlphabetic(int codePoint): 알파벳여부 판별
		//static boolean	isDigit(char ch): 숫자여부 판별
		//static boolean	isLowerCase(char ch):알파벳 소문자면 true
		//static boolean	isUpperCase(char ch):알파벳 대문자면 true
		
		/*   기본자료형		Wrapper 클래스
		 * ----------------------------------
		 * 	byte			Byte
		 *  short			Short
		 *  char			Character
		 *  int				Integer
		 *  long			Long
		 *  float			Float
		 *  double			Double
		 *  boolean			Boolean
		 *  ----------------------------------
		 * 
		 * */
		
		if(Character.isDigit(i)) {
			System.out.println("숫자입니다~~");
		}else if(Character.isLowerCase(i)||Character.isUpperCase(i)) {
			System.out.println("알파벳 문자입니다");
		}else {
			System.out.println("기타 문자입니다");
		}
		

	}

}






