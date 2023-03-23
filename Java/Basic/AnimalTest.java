package day07;
import javax.swing.*;
public class AnimalTest {

	public static void main(String[] args) {
	
		String type=JOptionPane.showInputDialog("동물 종류 입력");
		String cnt=JOptionPane.showInputDialog("새끼 수 입력");
		if(type==null||cnt==null) return;
		
		int cnt_int=Integer.parseInt(cnt);
		Animal an=null;
		//Animal a=new Animal();//[x]//추상클래스는 타입 선언은 가능하나 new 해서 객체생성은 할 수 없다
		if(type.equals("강아지")) {
			an=new Dog();
			an.type="강아지";
		}else if(type.equals("고양이")) {
			an=new Cat();
			an.type="고양이";
		}else if(type.equals("오리")) {
			an=new Duck();
			an.type="오리";
					
		}
		else {
			System.out.println("그런 동물 안키워!!");
			return;
		}
		System.out.println("=="+an.type+"====");
		an.crySound();
		an.getBaby(cnt_int);
		
		
	}//main()--------------

}//class /////////////////////////////////
