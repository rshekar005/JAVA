package Interview;

public class Factorial 
{
	// Non Recursive
	public static int factorial(int num)
	{
		int fact=1;//fact initailizing with 1 because if we initialize with 0 it returns 0;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String args[])
	{
		System.out.println(factorial(4));
	}

}
