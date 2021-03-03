package Java_AWT;
import java.awt.*;
import java.awt.event.*;

public class ChoiceDemo extends Frame implements ActionListener
{
	
	Label l,l1;
	Choice choice;
	
	ChoiceDemo()
	{
		Frame f = new Frame("Choice Demo");
		
		l= new Label("Choose any fruit name : ");
		l.setBounds(50,50,200,40);
		
		 choice= new Choice();
		choice.setBounds(100,100,200,50);
		choice.add("Mango");
		choice.add("Orange");
		choice.add("Banana");
		choice.add("kiwi");
		choice.add("Chiku");
		
		l1  =new Label();
		l1.setBounds(100,150,300,40);
		
		
		Button b= new Button("Show");
		b.setBounds(350,95,100,30);
		b.addActionListener(new ActionListener()
		{
		public void actionPerformed(ActionEvent e)
             {
	            String data = choice.getItem(choice.getSelectedIndex());
	           l1.setText("Fruit Name Selected :" + data);
             }
           }); 
				
			     
			
		
		f.add(b);
		f.add(l);
		f.add(l1);
		f.add(choice);
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
		ChoiceDemo c= new ChoiceDemo();
	}

}


                 
                         
