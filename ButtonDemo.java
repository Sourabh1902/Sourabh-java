package Java_AWT;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo extends Frame implements ActionListener
{
	ButtonDemo()
	{
		Frame f = new  Frame("Button Demo");
		final TextField t= new TextField();
		t.setBounds(200,300,200,50);
		
		Button b = new Button("Click me");
		b.setBounds(200,100,200,50);
		b.addActionListener(new ActionListener()
				{
				public void actionPerformed(ActionEvent e)
		    {
			 t.setText("Button Is Clicked");
			f.setBackground(Color.green);
		   }
	});
		b.setBackground(Color.red);
		b.setForeground(Color.white);
		
		f.add(t);
		f.add(b);
		f.setLayout(null);
		f.setSize(600,700);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
				{
			        public void windowClosing(WindowEvent e)
			        {
			        	System.exit(0);
			        }
				});
		
	}
	
	public void paint(Graphics g)
	{
		String s= 
	}
	public static void main(String[] args) 
	{
		new ButtonDemo();

	}

}
