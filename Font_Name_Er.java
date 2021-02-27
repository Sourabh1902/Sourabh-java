package Java_Lab_Programs;
import java.awt.*;
import java.awt.event.*;

public class Font_Name_Er extends Frame
{
	Font_Name_Er()
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
		Font f1= new Font("Arial",Font.BOLD, 30);
		g.setFont(f1);
		g.drawString("Name : ", 100,80);
		g.drawString("Er. No. : ", 100,140);
		g.drawString("Branch. : ", 100,200);
		g.drawString("Course. : ", 100,260);
		g.drawString("Session : ", 100,320);
		
		Font f2= new Font("SimSun", Font.BOLD+Font.ITALIC, 50);
		g.setFont(f2);
		g.setColor(Color.red);
		g.drawString("Sourabh Verma",250,80);
		
		Font f3= new Font("Serif", Font.BOLD, 40);
		g.setFont(f3);
		g.setColor(Color.green);
		g.drawString("19100BTIT06621",250,140);
		
		Font f4= new Font("Calibri", Font.ITALIC, 40);
		g.setFont(f4);
		g.setColor(Color.blue);
		g.drawString("B.TECH",250,200);
		
		Font f5= new Font("Verdana",Font.BOLD, 40);
		g.setFont(f5);
		g.setColor(Color.pink);
		g.drawString("Information Technology",250,260);
		
		Font f6= new Font("Wide Latin", Font.ITALIC, 40);
		g.setFont(f6);
		g.setColor(Color.orange);
		g.drawString("2019-2023",250,320);
		
		
		
	}
	public static void main(String[] args) 
	{
		Font_Name_Er n= new Font_Name_Er();
		n.setTitle("Font Demo");
		n.setLayout(null);
		n.setSize(800,800);
		n.setVisible(true);

	}

}
