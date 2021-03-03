package Java_Lab_Programs;
import java.awt.*;
import java.awt.event.*;

public class Multiple_Button extends Frame implements ActionListener
{
	final TextField t;
	Multiple_Button()
	{
		t= new TextField();
		t.setBounds(100,100,400,30);
		
		Button b1= new Button("Hindi");
		b1.setBounds(100,150,70,30);
		b1.setBackground(Color.blue);
		b1.setForeground(Color.white);
		
		Button b2= new Button("English");
		b2.setBounds(200,150,70,30);
		b2.setBackground(Color.blue);
		b2.setForeground(Color.white);
		
		Button b3= new Button("Hin. + Eng.");
		b3.setBounds(300,150,70,30);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		
		Button b4= new Button("Not any");
		b4.setBounds(400,150,70,30);
		b4.setBackground(Color.blue);
		b4.setForeground(Color.white);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		add(t);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		setTitle("Multiple Button");
		setSize(600,600);
		setLayout(null);
		setVisible(true);
		addWindowListener(new WindowAdapter()
				{
			       public void windowClosing(WindowEvent e)
			       {
			    	   System.exit(0);
			       }
				});
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("Hindi"))
			t.setText("   I know Hindi Language !");
		if(s.equals("English"))
			t.setText("  I know English Language ! ");
		if(s.equals("Hin. + Eng."))
			t.setText("  I know both Hindi & English Language !");
		if(s.equals("Not any"))
			t.setText("  I don't know any Language !");
	}
	public static void main(String[] args) 
	{
		
		Multiple_Button mb= new  Multiple_Button();
		
	}

}
