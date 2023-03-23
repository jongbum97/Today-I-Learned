package day11;

import javax.swing.JPanel;
import java.awt.*;
//모든 컴포넌트와 컨테이너들은 paint()메서드를 같는다
public class MyCirclePanel extends JPanel {
	
	int x=50, y=150;
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//g.setColor(Color.blue);
		//g.drawRect(50,50,100,100);//x,y,w,h
		//g.fillRect(50, 50, 100, 100);
		
		g.setColor(Color.orange);
		g.fillOval(x,y,100,100);//x,y,w,h
		//g.drawImage()
	}

}
