package Interview;

public class MissingNumberInArray 
{
	public static void main(String args[])
	{
		int a[]={1,2,3,5};
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("Sum of Array is "+sum);
		
		int sum1=0;
		for(int j=1;j<=5;j++)
		{
			sum1=sum1+j;
		}
		System.out.println("Sum between 1 to 5 is "+sum1);
		
		int NumberMissing=sum1-sum;
		System.out.println("Missing Number is " +NumberMissing);
	}

}
