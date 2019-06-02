package Interview;

public class FibonacciSeries 
{
	//In fibonacci series, next number is the sum of previous two numbers 
	//for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55 etc. The first two numbers of fibonacci series are 0 and 1.
	public static void main(String args[])
	{
		int n1=0; 
		int n2=1; 
		int n3=0; 
		int count=10;
		System.out.println(n1 +" "+  n2);
		for(int i=2;i<=count;i++)//Here  i value starting from 2 because n1 and n2 aleardy declared.
		{
			n3=n1+n2;
			System.out.println(n3);
			n1=n2;
			n2=n3;
		}
	}

}
