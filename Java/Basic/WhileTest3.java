package day03;
import javax.swing.JOptionPane;
public class WhileTest3 {

	public static void main(String[] args) {
		//[1] JOptionPane으로 "구구단 몇단을 출력할까요?"
		
		String str=JOptionPane.showInputDialog("구구단 몇단을 출력할까요?");
		if(str==null) return;
		int dan=Integer.parseInt(str.trim());//앞뒤 공백문자열을 제거함
		
		int i=1;
		while(i<10) {
			System.out.printf("%d x %d =%d%n", dan,i,dan*i);
			i++;
		}
		
		//[2] 구구단 전체를 아래와 같은 형태로 출력하세요 =>중첩 while or do~while
			/*
			 * 2x1=2	3x1=3	....		9x1=9
			 * 2x2=4	3x2=6				9x2=18
			 * ...
			 * 2x9=18
			 * */
		
		int y=1;		
		while(y<10) {
			int x=2;
			while(x<10) {
				System.out.printf("%d x %d =%d\t", x, y, x*y);
				x++;
			}
			System.out.println();
			y++;
		}
		
		
		
	}

}
