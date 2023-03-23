package day08;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import day07.MyJPanel;
/*이벤트 처리 절차
 * [1] import java.awt.event.*;
 * [2] XXXListener 인터페이스를 상속받는다 (ActionListener)
 * [3] 추상메서드를 오버라이딩한다. (빈블럭으로) => 이벤트 처리 메서드
 * [4] 이벤트소스에 리스너를 붙인다. addXXXListener()메서드 이용
 * 		=> b1.addActionListener(핸들러객체)
 * [5] 오버라이딩한 메서드에 이벤트 처리코드를 구현
 * 
 * JButton=>ActionEvent ==> ActionListener
 * 추상메서드
 * void	actionPerformed(ActionEvent e)
 * */
public class MyCalc extends JFrame implements ActionListener{//[2]

	Container cp;
	JPanel p = new MyJPanel();
	JLabel lb1, lb2, lb3;//정수1,정수2, 결과
	JTextField tf1, tf2, tfResult;
	JButton btPlus, btReset;
	
	public MyCalc() {
		super("::MyCalc::");
		cp = this.getContentPane();
		cp.add(p, "Center");
		p.setBackground(Color.white);
		//레이아웃 잡기, 컴포넌트 생성해서 붙이기
		p.setLayout(new GridLayout(4,2,10,10));
		lb1=new JLabel("정수1 : ", JLabel.CENTER);
		lb2=new JLabel("정수2 : ", JLabel.CENTER);
		lb3=new JLabel("결 과 : ", JLabel.CENTER);
		
		tf1=new JTextField(20);
		tf2=new JTextField(20);
		tfResult=new JTextField(20);
		
		btPlus=new JButton("Plus");
		btReset=new JButton("Reset");
		
		p.add(lb1); p.add(tf1);
		p.add(lb2); p.add(tf2);
		p.add(lb3); p.add(tfResult);
		p.add(btPlus); p.add(btReset);
		
		btPlus.setMnemonic('P');//단축키 설정 Alt+P, (Mac)control+option+P
		btReset.setMnemonic('R');//Alt+R
		
		tfResult.setEditable(false);//편집 못하게 readonly
		
		//리스너 부착 //[4]
		btPlus.addActionListener(this);
		btReset.addActionListener(this);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-----------------------
	@Override
	public void actionPerformed(ActionEvent e)	
	{//[3]
		Object obj=e.getSource();
		if(obj==btPlus) {
			try {
				calc();
			}catch(NumberFormatException ex) {
				JOptionPane.showMessageDialog(this, "정수를 입력해야 해요");
				reset();
			}
		}else if(obj==btReset) {
			reset();
		}
	}//-----------------------
	
	//RuntimeException계열의 예외는 throws문을 생략해도 된다
	public void calc() throws NumberFormatException {
		//tf1,tf2에 입력한 값 받아오기
		String str1=tf1.getText();
		String str2=tf2.getText();
		
		//정수로 변환하기 ====> 예외발생하면 예외 처리하기 ==> JOptionPane.showMessageDialog( )
		int n1=Integer.parseInt(str1.trim());
		int n2=Integer.parseInt(str2.trim());
		//더하기 연산 수행
		int n3=n1+n2;
		
		//그 결과 tfResult에 출력하기
		tfResult.setText(String.valueOf(n3));//Integer.toString(n3);
	}//--------------------------
	public void reset() {
		//tf1, tf2, tfResult를 모두 초기화
		tf1.setText("");
		tf2.setText("");
		tfResult.setText("");
		tf1.requestFocus();//입력 포커스 주기
	}//--------------------------
	

	public static void main(String[] args) {
		MyCalc my = new MyCalc();
		my.setSize(300, 300);//w,h
		my.setLocation(500,300);//x, y
		
		my.setVisible(true);
	}

}
