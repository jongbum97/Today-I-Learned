package day02;

public class ForTest2 {

	public static void main(String[] args) {
		// 중첩 for루프 이용해서 아래와 같이 출력하세요
		/*
		 * [1] ***** ***** ***** *****
		 * 
		 * 4행5열
		 * 
		 */
		for (int j = 1; j < 5; j++) {
			for (int i = 1; i < 6; i++) {
				System.out.printf("%c", '*');
			}
			System.out.println();
		}
		/*
		 * [2]
		 * 
		 * * 
		 * ** 
		 * *** 
		 * ****
		 * 
		 */
		System.out.println("\n------------------------------------");
		// [2]
		for (int i = 0; i < 4; i++) {
			System.out.print("\n");
			for (int j = 0; j <= i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("\n------------------------------------");

		/*[3]
		 * 
		 *    *
		 *   **
		 *  ***
		 * ****     
		 * 
		 * (0,0)(0,1)(0,2)(0,3)
		 * (1,0)(1,1)(1,2)(1,3)
		 * (2,0)(2,1)(2,2)(2,3)
		 * (3,0)(3,1)(3,2)(3,3)
		 * */
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				if(i+j>=3) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		System.out.println("\n------------------------------------");

		/* [4]
		 *    *
		 *   ***
		 *  *****  
		 * 
		 * (0,0)(0,1)(0,2)(0,3)(0,4)
		 * (1,0)(1,1)(1,2)(1,3)(1,4)
		 * (2,0)(2,1)(2,2)(2,3)(2,4)
		 * */
		//3행 5열
		for(int i=0;i<3;i++) {
			for(int j=0;j<5;j++) {
				if(i+j>=2 && j-i<=2) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}//for
			System.out.println();
		}//for------------
		
		/*
		 * [5]
		 * 
		 * * 
		 * ** 
		 * *** 
		 * **** 
		 * *** 
		 * ** 
		 * *
		 *  num: 7   star?
		 *  1		1
		 *  2		2
		 *  3		3
		 *  4		4
		 *  5		3
		 *  6		2
		 *  7		1
		 */
		System.out.println("\n------------------------------------");
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			
			int star=(i<=num/2+1)? i:(num+1 -i);
			
			for(int j=1;j<=star;j++) {
				System.out.print("*");
			}
			System.out.println();
		}//for-----
		
		

	}

}
