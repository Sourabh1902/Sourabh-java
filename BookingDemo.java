package Java_AWT;
import java.awt.*;

import java.awt.event.*;
import javax.swing.*; 

public class BookingDemo extends Frame implements ActionListener
{
    BookingDemo()
    {
       Frame f= new Frame("Practice");
       MenuBar mb = new MenuBar();
       Menu home= new Menu("Home");
       Menu about= new Menu("About");
       Menu galary= new Menu("Galary");
       Menu food= new Menu("Food");
       Menu contect= new Menu("Contect");
       MenuItem i1= new MenuItem("Item1");
       MenuItem i2= new MenuItem("Item2");
       MenuItem i3= new MenuItem("Item3");
       MenuItem i4= new MenuItem("Item4");
       MenuItem i5= new MenuItem("Item5");
       MenuItem i6= new MenuItem("Item6");
       MenuItem i7= new MenuItem("Item7");
       home.add(i1);
       home.add(i2);
       about.add(i3);
       about.add(i4);
       contect.add(i5);
       contect.add(i6);
       contect.add(i7);
       mb.add(home);
       mb.add(about);
       mb.add(galary);
       mb.add(food);
       mb.add(contect);
       
       Font font= new Font("Arial", Font.BOLD+Font.ITALIC,30);
       
       Label l= new Label("REGISTRATION FORM ");
       l.setBounds(200,70,400,40);
       l.setFont(font);
       
       Label l1= new Label("Name : ");
       l1.setBounds(100,130,100,40);
       
       TextField t1 = new TextField();
       t1.setBounds(200, 140,250,30);
       
       Label l2= new Label("Age : ");
       l2.setBounds(100,190,100,40);
       
       TextField t2 = new TextField();
       t2.setBounds(200, 200,250,30);
       
       Label l3= new Label("Email : ");
       l3.setBounds(100,250,100,40);
       
       TextField t3 = new TextField();
       t3.setBounds(200, 260,250,30);
       
       Label l4= new Label("Password : ");
       l4.setBounds(100,310,100,40);
       
       JPasswordField t4 = new JPasswordField();
       t4.setBounds(200, 320,250,30);
       
       Label l5= new Label("Address : ");
       l5.setBounds(100,370,100,40);
       
       TextArea t5 = new TextArea();
       t5.setBounds(200, 380,250,100);
       
       Label l6= new Label("Gender :");
       l6.setBounds(100,490,100,40);
       
       CheckboxGroup cb= new CheckboxGroup();
       Checkbox c1= new Checkbox("Male",cb,false);
       c1.setBounds(200,490,50,40);
       Checkbox c2= new Checkbox("Female",cb,false);
       c2.setBounds(270,490,100,40);
       
       Label l7= new Label("Language :");
       l7.setBounds(100,520,100,40);
       
       Checkbox c3= new Checkbox("Hindi");
       c3.setBounds(200,520,50,40);
       
       Checkbox c4= new Checkbox("English");
       c4.setBounds(270,520,50,40);
       
       Checkbox c5= new Checkbox("Other");
       c5.setBounds(340,520,50,40);
       
       Label l8= new Label("Education :");
       l8.setBounds(100,560,100,40);
       
       Choice choice = new Choice();
       choice.setBounds(200,570,200,40);
       choice.add("10TH");
       choice.add("12TH");
       choice.add("Graduate");
       choice.add("Post Graduate");
       choice.add("Diploma");
       choice.add("Phd");
       
     
      
       Label l9= new Label();
       l9.setBounds(100,700,200,40);
       l9.setForeground(Color.red);
      
       
       Button b1 =new Button("Submit");
       b1.setBounds(100,610,390,50);
       b1.setBackground(Color.blue);
       b1.setForeground(Color.white);
       b1.addActionListener(new ActionListener()
    		   {
    	         public void actionPerformed(ActionEvent e)
    	         {
    	        	 l9.setBackground(Color.green);
    	        	 l9.setText("Rgistration Successful");
    	        	 
    	         }
    		   });
       
      
       
       
      // f.setBackground(Color.red);
       f.setMenuBar(mb);
       f.add(l);
       f.add(l1);
       f.add(t1);
       f.add(l2);
       f.add(t2);
       f.add(l3);
       f.add(t3);
       f.add(l4);
       f.add(t4);
       f.add(l5);
       f.add(t5);
       f.add(l6);
       f.add(c1);
       f.add(c2);
       f.add(l7);
       f.add(c3);
       f.add(c4);
       f.add(c5);
       f.add(l8);
       f.add(choice);
       f.add(b1);
       f.add(l9);
       
       f.setLayout(null);
       f.setSize(800,1000);
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
		
	 BookingDemo bd= new BookingDemo();	

	}

}
