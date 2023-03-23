package day11;

public class Account {
	private int money=10;
	private boolean flag=false;
	
	public void save(int value) {
		synchronized(this) {//동기화 블럭 ==> 객체의 lock을 쥐어야만 해당 블럭을 수행할 수 있음
			if(flag) {
				try {
					wait();
				}catch(InterruptedException e) {}
			}
			money+=value;
			System.out.printf("입금액: %d, 입금후 잔액: %d%n", value, money);
			notify();
			flag=true;
			//wait pool에 대기 중인 스레드 하나를 깨워서 runnable상태로 전환시킨다
			//notifyAll() => 대기 중인 스레드를 모두 깨움
		}
	}//-------------------
	
	synchronized public void get(int value) {
		if(!flag) {
			try {
				wait();
				//wait()호출되면 스레드는 수행 권한을 포기하고 wait pool에 가서 대기한다
				//이 때 락을 반납하고 대기상태로 들어간다
			}catch(InterruptedException e) {}
		}
		if(money-value<0) {
			System.out.printf("현금 부족!! 현재 잔액: %d, 요청 금액: %d%n", money, value);
			flag=false;
			notify();
			return;
		}
		money-=value;
		System.out.printf("출금액: %d, 출금후 잔액: %d%n", value, money);
		flag=false;
		notify();
	}

}///////////////////////
