package day07;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//[1]

public class MyEngine extends JFrame implements ActionListener {//[2]

	Container cp;
	JPanel p = new MyJPanel();
	JButton[] bt=new JButton[4];
	String[] str= {"Naver","Google","Daum","Yahoo"};
	Color origin;//원래색
	public MyEngine() {
		super("::MyEngine::");
		cp = this.getContentPane();
		cp.add(p, "Center");
		//p.setBackground(Color.white);
		p.setLayout(new GridLayout(2,2,10,10));
		
		for(int i=0;i<bt.length;i++) {
			bt[i]=new JButton(str[i]);
			p.add(bt[i]);
			bt[i].addActionListener(this);//[4] 리스너 부착
		}

		origin=bt[0].getBackground();
		//System.out.println(origin);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-------------------
	
	@Override
	public void actionPerformed(ActionEvent e) {//[3]		
		//[5]
		Object obj=e.getSource();
		String cmd=e.getActionCommand();//이벤트소스의 문자열 반환
		
		Color bg=((JButton)obj).getBackground();
		this.setTitle(cmd+"버튼을 눌렀네요!!");
		if(bg==origin) {
			if(obj==bt[0]) {
				bt[0].setBackground(Color.green);
			}else if(obj==bt[1]) {
				bt[1].setBackground(Color.orange);
			}else if(obj==bt[2]) {
				bt[2].setBackground(Color.magenta);
			}else if(obj==bt[3]) {
				bt[3].setBackground(Color.cyan);
			}
		}else {
			((JButton)obj).setBackground(origin);
		}
	}

	public static void main(String[] args) {
		MyEngine my = new MyEngine();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}