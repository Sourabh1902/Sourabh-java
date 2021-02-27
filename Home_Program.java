package Java_Lab_Programs;
import java.awt.*;
import java.awt.event.*;

public class Home_Program extends Frame
{
	Home_Program()
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
	   g.setColor(Color.green);
	   g.fillRect(10,850,1700,150);
	   
	   g.setColor(Color.orange);
	   g.fillRect(200,370,850,480);
	   
	   g.setColor(Color.red);
	   g.fillRect(300, 550, 200, 300);
	   g.fillRect(690,500,150,150);
	   
	   g.setColor(Color.gray);
	   g.fillRect(140,350,960,30);
	   
	   g.setColor(Color.red);
	   g.fillRect(1450,650,60,200);
	   
	   //g.setColor(Color.green);
	  // g.drawLine(1430,400,1650,650);
	   
	   g.setColor(Color.blue);
	   g.fill3DRect(1200, 770, 20, 80, true);
	   g.fill3DRect(1230, 770, 20, 80, true);
	   g.fillRect(1155,700,40,20);
	   g.fillRect(1250,700,40,20);
	   
	   g.setColor(Color.yellow);
	   g.fillRect(1192,685,65,100);
	   
	   g.setColor(Color.orange);
	   g.fillOval(1200, 635, 50, 50);
	   g.fillOval(1400,100,200,200);
	   
	   g.setColor(Color.black);
	   g.fillOval(1215,650,5,5);
	   g.fillOval(1230,650,5,5);
	   
	   g.setColor(Color.red);
	   g.fillOval(1225,700,5,5);
	   g.fillOval(1225,720,5,5);
	   g.fillOval(1225,740,5,5);
	   g.fillOval(1225,760,5,5);
	   
   }
   
	public static void main(String[] args) 
	{
		Home_Program h= new   Home_Program();
		h.setSize(1700,1000);
		h.setLayout(null);
		h.setVisible(true);
		

	}

}
