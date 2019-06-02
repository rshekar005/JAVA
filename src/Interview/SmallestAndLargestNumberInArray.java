package Interview;

import java.util.Arrays;

public class SmallestAndLargestNumberInArray 
{
	public static void main(String args[])
	{
		int num[]={-10,0,2,6,1000,100};
		
		int largest=num[0];//Initially declaring value which is at 0th index
		int smallest=num[0];
		System.out.println("Length of an Array is "+num.length);
		for(int i=1;i<num.length;i++)
		{
			if(num[i]>largest)
			{
				largest=num[i];
			}
			else if(num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println("Array is "+Arrays.toString(num));//Which is used to print array.
		System.out.println("Largest Number is "+largest);
		System.out.println("Smallest Number is "+smallest);
		
		
	}
	

}
