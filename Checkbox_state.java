package Java_Lab_Programs;
import java.awt.*;
import java.awt.event.*;

public class Checkbox_state extends Frame implements ItemListener
{
	Checkbox c1,c2,c3,c4;
	String s;
	Label l1,l2,l3,l4;
	Checkbox_state()
	{
		
		c1= new Checkbox("Hindi");
		c1.setBounds(50,100,50,40);
		
		l1= new Label();
		l1.setBounds(150,100,200,40);
		
		c2= new Checkbox("English");
		c2.setBounds(50,150,50,40);
		
		l2= new Label();
		l2.setBounds(150,150,200,40);
		
		c3= new Checkbox("Science ");
		c3.setBounds(50,200,60,40);
		
		l3= new Label();
		l3.setBounds(150,200,200,40);
		
		c4= new Checkbox("Maths");
		c4.setBounds(50,250,50,40);
		
		l4= new Label();
		l4.setBounds(150,250,200,40);
		
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		c4.addItemListener(this);
		
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(c1);
		add(c2);
		add(c3);
		add(c4);
		setTitle("Checkbox States");
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
	public void itemStateChanged(ItemEvent e)
	{
		
		if(e.getSource()==c1)
			l1.setText("Checked");
		
		if(e.getSource()==c2)
			l2.setText("Checked");
		
		if(e.getSource()==c3)
			l3.setText("Checked");
		
		if(e.getSource()==c4)
			l4.setText("Checked");
	
		
		
	}
	
	public static void main(String[] args) 
	{
	
		Checkbox_state ch= new Checkbox_state();
	}

}
