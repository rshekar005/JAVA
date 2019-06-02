package Interview;

import java.util.Scanner;

public class Multiply 
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n= scan.nextInt();
		System.out.println("Number is " +n);
		for(int i=1;i<=10;i++)
		{
			int result=n*i;
			System.out.println(n +"*"+ i +"="+ result);
		}
	}

}
