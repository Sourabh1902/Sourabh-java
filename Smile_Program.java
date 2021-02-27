package Java_Lab_Programs;
import java.awt.*;
import java.awt.event.*;

public class Smile_Program extends Frame  
{
	Smile_Program()
	{
		
		
		
		
		this.addWindowListener(new WindowAdapter()
				{
			       public void windowClosing(WindowEvent e)
			       {
			    	   System.exit(0);
			       }
				});
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
		g.fillRect(100, 100, 400, 400);
		
		g.setColor(Color.yellow);
		g.fillOval(170, 170, 250,250);
		
		g.setColor(Color.black);
		g.fillOval(240, 240, 10, 10);
		g.fillOval(340, 240, 10, 10);
		g.drawLine(300,300,300,230);
		
		g.setColor(Color.red);
		g.drawArc(240,290,120,70,-160,140);
	}
	public static void main(String[] args) 
	{
		 Smile_Program s= new Smile_Program();
		   s.setLayout(null);
		   s.setSize(800,800);
			s.setVisible(true);
			
	}

}
