package Interview;

public class ReverseString 
{
	public static void main(String args[])
	{
		//In String there is no reverse function.
		String s="Automation Testing";
		int length=s.length();
		String reverse="";
		
		for(int i=length-1;i>=0;i--)
		{
			reverse= reverse+s.charAt(i);
		}
		System.out.println(reverse);
		
		//In StringBuffer reverse function is available.
		StringBuffer sb= new StringBuffer("Automation");
		System.out.println(sb.reverse());
		
		
		//Print Reverse string in words
		String str2= "Automation Engineer";
		String arr[]=str2.split("\\s");
		String rev="";
		for(int i=arr.length-1;i>=0;i--)
		{
			rev=rev+arr[i]+" ";
		}
		System.out.println(rev);
	
		
		
		
	}

}
