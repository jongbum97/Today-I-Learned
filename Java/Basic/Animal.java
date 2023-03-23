package day07;

public abstract class Animal {//추상클래스
	String type;
	abstract void crySound();
	abstract void getBaby(int num);
	
	public String toString() {
		return "Animal";
	}

}///////////////////
class Dog extends Animal
{
	@Override
	void crySound() {
		System.out.println("멍멍~~");
	}
	@Override
	protected void getBaby(int n) {
		System.out.println(n+"마리의 새끼를 낳았어요~");
	}
	
}//////////////////
class Cat extends Animal
{
	public void crySound() {
		System.out.println("야옹 야옹~~");
	}
	public void getBaby(int n) {
		System.out.println(n+"마리의 새끼를 낳았어요~");
	}
}///////////////////
class Duck extends Animal
{

	@Override
	void crySound() {
		System.out.println("꽥꽥~~");
		
	}

	@Override
	void getBaby(int num) {
		System.out.println(num+"개의 알을 낳았어요~");
		
	}
	
}/////////////////////





