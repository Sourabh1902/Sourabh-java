package Java_Lab_Programs;
import java.awt.*;
import java.awt.event.*;

public class ShowClearMsg extends Frame implements ActionListener
{
    final TextField t;
    Button b1, b2;
 
	ShowClearMsg()
	{
		Frame f= new Frame();
		
		 t= new TextField();
		t.setBounds(100,100,300,40);
		
		b1= new Button("Show");
		b1.setBounds(150,150,100,40);
		
		b2= new Button("Hide");
		b2.setBounds(300,150,100,40);
		
	     b1.addActionListener(this);
		 b2.addActionListener(this);
		
		f.add(t);
		f.add(b1);
		f.add(b2);
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter()
				{
			       public void windowClosing(WindowEvent e)
			       {
			    	   System.exit(0);
			       }
				});
	}
	public void actionPerformed(ActionEvent e)
	{
		String s= e.getActionCommand();
		if(s.equals("Show"))
			t.setText("THIS is SOURaBH verma");
		if(s.equals("Hide"))
			t.setText("");
	}
	public static void main(String[] args)
	{
		ShowClearMsg scm = new  ShowClearMsg();

	}

}
