package Java_AWT;
import java.awt.*;

public class First_Awt 
{
    First_Awt()
    {
    	Frame f=new Frame("First Frame");
    	
    	Label name = new Label("Name :");
    	name.setBounds(20,40,70,50);
    	f.add(name);
    	
    	TextField n=new TextField();
    	n.setBounds(20, 90, 300, 30);
    	f.add(n);
    	
    	Label pass = new Label("Password :");
    	pass.setBounds(20,100,70,50);
    	f.add(pass);
    	
    	TextField p=new TextField();
    	p.setBounds(20, 160, 300, 30);
    	f.add(p);
    	
    	Button b=new Button("Click Me");
    	b.setBounds(20,200,70,30);
    	f.add(b);
    	
    	
    	
    	
    	
    	f.setLayout(null);
    	f.setSize(400, 300);
    	f.setVisible(true);
    	
    	
    }
	public static void main(String[] args)
	{
	   First_Awt a=new First_Awt();	
     
	}

}
