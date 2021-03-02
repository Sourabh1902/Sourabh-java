package Java_AWT;
import java.awt.*;
import java.awt.event.*;

public class CheckboxDemo  implements ItemListener
{
	
	CheckboxDemo()
	{
		Frame f= new Frame("Checkbox Demo");
		
		Checkbox c1= new Checkbox("Java");
		c1.setBounds(100,100,100,40);
		//c1.setState(true);
		
		Checkbox c2= new Checkbox("Python");
		c2.setBounds(200,100,100,40);
		
		
		Label l1= new Label();
		l1.setBounds(100,200,200,40);
		
		Label l2= new Label();
		l2.setBounds(300,200,200,40);
		
		c1.addItemListener(new ItemListener()
		{
	     public void itemStateChanged(ItemEvent e)
	     {
		l1.setText("Java "+(e.getStateChange()==1?"Checked":"Unchecked"));
	    }
		});
        c2.addItemListener(new ItemListener()
		{
   	     public void itemStateChanged(ItemEvent e)
   	     {
   		l2.setText("Python "+(e.getStateChange()==1?"Checked":"Unchecked"));
   	    }
   		});

		
		f.add(c1);
		f.add(c2);
		f.add(l1);
		f.add(l2);
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
	
	
	public static void main(String[] args)
	{
		
		CheckboxDemo ch= new CheckboxDemo();
	}

}
