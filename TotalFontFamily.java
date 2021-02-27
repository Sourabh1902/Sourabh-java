package Java_Lab_Programs;

import java.awt.GraphicsEnvironment;

public class TotalFontFamily
{

	public static void main(String[] args) 
	{
		int count=0;
		String font[]= GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for(String fo : font)
		{
			count++;
			System.out.println(fo);
		}
		System.out.println("Total Number of FontFamily = "+count);

	}

}
