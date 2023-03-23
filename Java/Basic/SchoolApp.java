package day05;
/*학사 관리 프로그램

학생: 학번(no), 이름(name), 학급명(className)  ===> Student
강사: 교번(no), 이름(name), 과목(subject)	 ===> Teacher
직원: 사번(no), 이름(name), 부서(dept)	 ===> Staff

==> 추상화하고, 속성(멤버변수)을 모두 캡슐화한 뒤
      setter, getter를 구성하세요
      
showInfo()메서드 구성해서
각 정보 출력하기      
*/
public class SchoolApp {

	public static void main(String[] args) {
		// Student, Teacher, Staff객체 생성해서 값 할당하고 출력해보기
		Student s1=new Student();
		s1.showInfo();
		//s1.no=1; //[x]
		s1.setNo(1);
		s1.setName("김학생");
		s1.setClassName("백엔드 개발자반");
		
		s1.showInfo();
		
		Teacher t1=new Teacher();
		t1.setNo(100);
		t1.setName("최교사");
		t1.setSubject("Java");
		t1.showInfo();
		
		// 문제1]학생 객체를 2개 더 생성하고...
		// 각각 이름,학번,학급 값을 넣어준뒤...
		// 3명의 학생을 배열에 저장하자.
		// for루프 돌리면서 저장된 학생 객체들의
		// 정보를 출력해보자.
		Student s2=new Student();
		s2.setNo(2);
		s2.setName("이연수");
		s2.setClassName("AI서비스반");
		
		Student[] arr=new Student[3];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=new Student();
		
		arr[2].setNo(3);
		arr[2].setName("하길성");
		arr[2].setClassName("빅데이터반");
		
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
		}
		System.out.println("***************");
		//확장for루프도 이용해 출력해보기
		for(Student s:arr) {
			s.showInfo();
		}
		Teacher t2=new Teacher();
		t2.setNo(101);
		t2.setName("홍교사");
		t2.setSubject("HTML");
		
		Teacher[] arr2= {t1, t2};
		
		for(Teacher t:arr2)
			t.showInfo();

	}

}
