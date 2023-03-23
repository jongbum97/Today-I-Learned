package day08;

interface Inter1{
	void a();//public abstract가 붙는다
	int b();
}///////////////////
interface Inter2{
	double PI=3.14;//public static final이 붙는다
}////////////////////
//인터페이스가 인터페이스를 상속받을 때는 extends로 받으며, 여러 개 상속 가능하다
interface Inter3 extends Inter1, Inter2
{
	void c();
}///////////////////
abstract class AbsClass //추상 클래스
{
	abstract void d();//생략형 접근지정자
	
}/////////////////
//[1] MyDemo클래스가 AbsClass,Inter3을 상속받은 뒤 에러 없도록 조치하세요
class MyDemo extends AbsClass implements Inter3
{
	public void a() {
		System.out.println("a()###");
	}
	public int b() {
		return 0;
	}
	public void c() {}
	void d() {
		System.out.println("d()@@@");
	}
}////////////////////////
public class InterfaceTest2 {

	public static void main(String[] args) {
		// [2] MyDemo객체 생성해서 a(),b(),c(),d()호출하고 PI값 출력하기
		MyDemo my=new MyDemo();
		my.a();
		System.out.println(my.b());
		my.c();
		my.d();
		System.out.println("MyDemo.PI="+MyDemo.PI);
		System.out.println("Inter2.PI="+Inter2.PI);
		
		Inter1 im=new MyDemo();
		Inter2 im2=new MyDemo();
		Inter3 im3=new MyDemo();
		AbsClass ac=new MyDemo();
		
		im.a();
		System.out.println(im.b());
		//im.c();//[x]
		
		im3.c();
		im3.a();
		im3.b();
		
		//im2.a();//[x]
		ac.d();
		//ac.a();//[x]
		((MyDemo)ac).a();
		((Inter1)ac).a();

	}

}
