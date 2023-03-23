package day11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JFrame implements Runnable{

	Container cp;
	JPanel p = new JPanel();
	MyCirclePanel p2=new MyCirclePanel();
	JButton btStart, btStop;
	Thread tr;
	boolean isStop=false;

	public MoveCircle() {
		super("::MoveCircle::");
		cp = this.getContentPane();
		cp.add(p2, "Center");
		cp.add(p,"North");
		p.setBackground(Color.magenta);
		p2.setBackground(Color.white);
		
		p.add(btStart=new JButton("Start"));
		p.add(btStop=new JButton("Stop"));
		
		//btStart버튼에 대한 ActionEvent처리를 Anonymous로 해보기
		//타이틀 변경 "Start"
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//여기서의 this는 이름없는 클래스
				setTitle("Start..."+this);
				isStop=false;
				//스레드 생성해서 동작 시키기
				//MoveCircle r=new MoveCircle();//Runnable객체, 또다른 JFrame객체 [x]
				//r.setSize(200,200);
				//r.setVisible(true);
				//this==> Anonymous class의 this가된다.
				tr=new Thread(MoveCircle.this);
				tr.start();
			}
		});
		
		//btStop버튼에 대한 이벤트 처리 Lambda로 해보기
		//타이틀 변경 "Stop"
		btStop.addActionListener(e->{
			System.out.println(this);//람다식에서의 this는 MoveCircle이 된다
			setTitle("Stop...");
			isStop=true;
			//스레드 동작 중지 시키기
			//tr.stop();//[x] 안쓰는 것이 좋음 deprecated
			//tr.interrupt();
		});

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자-------------------
	
	@Override
	public void run() {
		while(!isStop) {
		//무한반복 돌면서 MyCirclePanel의 x값을 증가시킨다
			if(p2.x>p2.getWidth()) {
				p2.x=0;
			}
			p2.x+=5;
		//sleep() 걸어주기
			System.out.println("p2.x: "+p2.x);
			try {
				Thread.sleep(10);
			}catch(InterruptedException e) {
				System.out.println(e);
				break;
			}
			//p2.paint(); //[x]paint()메서드는 JVM이 호출하는 메서드==> 개발자는 repaint()를 호출해야 함
			p2.repaint();//JVM이 알아서 paint()를 호출함
			
		}//while-----
	}//run()----------------------

	public static void main(String[] args) {
		MoveCircle my = new MoveCircle();
		my.setSize(700, 500);
		my.setVisible(true);
	}

}