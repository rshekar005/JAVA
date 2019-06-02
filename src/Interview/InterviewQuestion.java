package Interview;

import java.sql.Array;
import java.util.Arrays;

public class InterviewQuestion 
{
	public static void main(String args[])
	{
		String arr[]={"The", "practice" ,"has", "been", "repeatedly", "endorsed", "by" , "congress"};
		
		System.out.println(arr.length);
		System.out.println(Arrays.toString(arr));
		for(int i=1;i<=arr.length-1;i++)
		{
			if(arr[i].length()>=4)
			{
				System.out.println(arr[i]);
			}
		}
	}

}
