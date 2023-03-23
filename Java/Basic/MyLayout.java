package day07;
import javax.swing.*;
import java.awt.*;
//바깥여백을 주려면 public Insets getInsets()메서드를 오버라이드 해야 한다
public class MyLayout extends JFrame {

	Container cp;
	JPanel p=new JPanel();
	JPanel p1_1, p1_2;
	JButton b1,b2,b3,b4,b5,b6;
	public MyLayout() {
		super("::MyLayout::");
		cp=this.getContentPane();
		
		cp.add(p);
		
		BorderLayout b = new BorderLayout();
		p.setLayout(b);
		
		p1_1 = new MyJPanel();
		p1_2 = new MyJPanel(25,25,25,25);
		
		p.add(p1_1, "Center");
		p.add(p1_2, "South");
		
		p1_1.setBackground(Color.yellow);
		p1_2.setBackground(Color.pink);
		
		p1_1.setLayout(new GridLayout(2,2,10,10));
		p1_2.setLayout(new GridLayout(2,1,10,10));
		 
		b1= new JButton("b1");
		b2= new JButton("b2");
		b3= new JButton("b3");
		b4= new JButton("b4"); 
		b5= new JButton("b5");
		b6= new JButton("b6");
		 
		p1_1.add(b1);p1_1.add(b2);
		p1_1.add(b3);p1_1.add(b4);
		p1_2.add(b5);
		p1_2.add(b6);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//생성자-------------------
	
	

	public static void main(String[] args) {
		MyLayout my=new MyLayout();
		my.setSize(500,500);
		my.setVisible(true);

	}

}
