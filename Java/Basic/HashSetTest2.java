package day10;

import java.util.*;

public class HashSetTest2 {

	public static void main(String[] args) {
		// Person객체 3개 생성해서
		// HashSet에 저장한 뒤
		// 반복문 이용해서 사람 정보를 출력하세요(이름, 나이)
		Person p1=new Person("홍길동",21);
		Person p2=new Person("김철수",22);
		Person p3=new Person("박민영",23);
		
		HashSet<Person> hs=new HashSet<>();
		hs.add(p1);
		hs.add(p2);
		hs.add(p3);
		for(Person ps:hs) {
			//System.out.println(ps);
			System.out.println(ps.getName()+": "+ps.getAge());
		}
		System.out.println("*******************");
		Person p4=new Person("김철수",22);//새로운 객체
		hs.add(p4);
		System.out.println("hs.size(): "+hs.size());//4
		
		Person p5=p1;//중복데이터로 간주한다(주소값이 같으므로)
		
		hs.add(p5);
		System.out.println("hs.size(): "+hs.size());//
		
		for(Person ps:hs) {
			System.out.println(ps.getName()+"@ "+ps.getAge());
		}
	}

}
