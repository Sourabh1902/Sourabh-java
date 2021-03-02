package Java_AWT;
import java.awt.*;
import java.awt.event.*;

public class TextAreaDemo extends Frame
{
	TextAreaDemo()
	{
		Frame f= new Frame("TextArea Demo");
		
		TextArea area= new TextArea();
		area.setBounds(100,50,400,300);
		
		Label l= new Label();
		l.setBounds(100,400,400,40);
		f.add(l);
		
		Button b= new Button("Count");
		b.setBounds(20,400,50,30);
		b.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
				
				String c= area.getText();
				l.setText("character = "+ c.substring(3).length()+" Count "+ c.length());
				
				
			}
				});
		
		f.add(b);
		f.add(area);
		f.setLayout(null);
		f.setSize(800,800);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
				{
			      public void windowClosing(WindowEvent e)
			      {
			    	  System.exit(0);
			      }
				});
		
	}
	
	public static void main(String[] args)
	{
		
		TextAreaDemo ta= new  TextAreaDemo();
	}

}
