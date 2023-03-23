package day04;
//구직자 클래스
public class JobSeeker {
	
	String name;
	int age;
	int salary;
	String field;
	
	public String introduce() {
		String intro="---자기 소개----\n";
		intro+="이  름: "+name+"\n";
		intro+="나  이: "+age+"\n";
		intro+="지원 분야: "+field+"\n";
		intro+="희망 급여: "+salary+"\n";
		return intro;
	}
	
	public String projects(String[] arr) {
		String str="참여한 프로젝트 목록...\n";
		if(arr.length==0) {
			return "없음";
		}
		for(int i=0;i<arr.length;i++) {
			str+=arr[i]+"\n";
		}
		return str;
	}

}
