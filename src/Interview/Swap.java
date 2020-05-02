package Interview;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Swap 
{
	public static void main(String args[])
	{
		int a=4;
		int b=10;
		System.out.println("Before swapping "+a+ " and "+b);
		/*int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping "+a+ " and "+b);*/
		
		System.out.println("Without temp variable");
		a=a-b;
		b=a+b;
		a=b-a;
		
		System.out.println("After Swapping "+a+ " and "+b);
		
	}

}
