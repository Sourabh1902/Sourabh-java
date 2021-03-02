package Java_AWT;
import java.awt.*;
import java.awt.event.*;

public class TextField_Demo extends Frame implements ActionListener
{
	TextField_Demo()
	{
		Frame f= new Frame("TextField Demo");
		
		Label l1= new Label("Enter a = ");
		l1.setBounds(50,100,80,40);
		
		TextField t1= new TextField();
		t1.setBounds(130,100,300,40);
		
		Label l2= new Label("Enter b = ");
		l2.setBounds(50,150,80,40);
		
		TextField t2= new TextField();
		t2.setBounds(130,150,300,40);
		
		Label l3= new Label("Result = ");
		l3.setBounds(50,200,80,40);
		
		TextField t3= new TextField();
		t3.setBounds(130,200,300,40);
		t3.setEditable(false);
		
		Button b1= new Button("PLUS : +");
		b1.setBounds(100,280,100,40);
		b1.setBackground(Color.green);
		b1.setForeground(Color.blue);
		
		Button b2= new Button("MINUS : -");
		b2.setBounds(240,280,100,40);
		b2.setBackground(Color.green);
		b2.setForeground(Color.blue);
		
		b1.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent e)
			{
			String s1= t1.getText();
			String s2= t2.getText();
			int a= Integer.parseInt(s1);
			int b= Integer.parseInt(s2);
			int c=0;  
	        if(e.getSource()==b1){  
	            c=a+b;  
	        }
	        String result=String.valueOf(c);  
	        t3.setText(result);  
			  
				
			}
				});
	    b2.addActionListener(new ActionListener()
		    {
	        public void actionPerformed(ActionEvent e)
	        {
	        String s1= t1.getText();
	        String s2= t2.getText();
	        int a= Integer.parseInt(s1);
	        int b= Integer.parseInt(s2);
	        int c= 0;  
              if(e.getSource()==b2){  
             c=a-b;  
              }
            String result=String.valueOf(c);  
             t3.setText(result);  
	         }
		});
		
		f.add(l1);
		f.add(l2);
		f.add(l3);
		f.add(t1);
		f.add(t2);
		f.add(t3);
		f.add(b1);
		f.add(b2);
		f.setLayout(null);
		f.setSize(500,700);
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
		
		new TextField_Demo();
	}

}
