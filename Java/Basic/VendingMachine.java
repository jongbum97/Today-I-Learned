package day05;
//메소드 오버로딩(다중정의)
/* [1] 메서드 이름은 같게 구성한다
 * [2] 매개변수는 자료형이 다르거나, 갯수가 다르거나, 순서가 달라야 한다
 * [3] 반환타입은 같아도 되고 달라도 된다. (반환타입은 신경쓰지 않음)
 * */


public class VendingMachine {
	
	private int coffee, sugar, cream;
	
	public void makeTea(int coffee, int sugar, int cream) {
		this.coffee=coffee;
		this.sugar=sugar;
		this.cream=cream;
		System.out.println("밀크 커피 나가요~~  농도: "+(this.coffee+this.sugar+this.cream));
	}
	public void makeTea(int c, int s) {
		coffee=c; sugar=s;
		System.out.println("설탕 커피 나가요~~ 농도: "+( coffee+sugar));
	}
	public String makeTea(int coffee) {
		this.coffee=coffee;
		return "블랙 커피 나가요~~ 농도: "+this.coffee;
	}
	//크림 커피
	public void makeTea(int coffee, short cream) {
		this.coffee=coffee;
		this.cream=cream;
		System.out.println("크림 커피 나가요~~ 농도: "+(this.coffee+this.cream));
	}
	public void makeTea(short cream, int coffee) {
		this.coffee=coffee;
		this.cream=cream;
		System.out.println("크림 커피 나가요~~ 농도: "+(this.coffee+this.cream));
	}
	//유자차 메서드 오버로드하기 
	public void makeTea(Yuja a) {
		System.out.println("유자 농도: "+a.getYuja());
		System.out.println("설탕 농도: "+a.getSugar());
		System.out.println("유자차 나가요~~ 농도: "+(a.getYuja()+a.getSugar()));
	}

}



