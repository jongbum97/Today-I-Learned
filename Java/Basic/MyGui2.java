package day09;
//이름없는 로컬 이너 클래스 사용 예제-Anonymous class
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//[1]
/* JButton     ==> ActionEvent  ==> ActionListener ==> void actionPerformed(ActionEvent)
 * 
 * JRadioButton==> ItemEvent    ==> ItemListener  ==> void itemStateChanged(ItemEvent)
 * */
/*이벤트핸들러 구성하는 방법
 * [1] 컴포넌트를 가진 클래스가 이벤트핸들러가 되는 방법
 * [2] 이너 클래스로 구성하는 방법
 * 		- 이너 멤버 클래스
 *      - 이름없는 로컬 클래스
 * [3] 외부 클래스로 구성하는 방법
 * */

public class MyGui2 extends JFrame {

	Container cp;
	JPanel p = new JPanel() {//Anonymous class
		
		public Insets getInsets() {
			return new Insets(40,10,10,10);
		}
	};
	JPanel pN= new JPanel();
	
	JRadioButton r,g,b;
	ButtonGroup gr=new ButtonGroup();
	Canvas can;
	
	public MyGui2() {
		super("::MyGui2::");
		cp = this.getContentPane();
		cp.add(p, "Center");
		cp.add(pN,"North");
		p.setBackground(Color.white);
		
		pN.add(r=new JRadioButton("Red"));
		pN.add(g=new JRadioButton("Green"));
		pN.add(b=new JRadioButton("Blue"));
		
		gr.add(r);
		gr.add(g);
		gr.add(b);

		can=new Canvas();//도화지 역할하는 컴포넌트. 사이즈 주고 배경색 줘야 확인 가능
		can.setSize(200,200);
		can.setBackground(Color.yellow);
		p.add(can);
		//리스너 부착----------------
		//Anonymous class로 이벤트 핸들러를 구성해본다
		r.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.red);
			}
		});
		
		//g
		g.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.green);
			}
		});
		
		//b
		/*b.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				can.setBackground(Color.blue);
			}
		});*/
		//Lambda식
		b.addItemListener((e)->{ can.setBackground(Color.blue);});
		
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		MyGui2 my = new MyGui2();
		my.setSize(500, 500);
		my.setVisible(true);
	}

}