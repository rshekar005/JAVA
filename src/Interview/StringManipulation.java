package Interview;

public class StringManipulation 
{
	public static void main(String args[])
	{
		String str= "The rain has started now selenium";
		
		System.out.println(str.length());
		
		System.out.println(str.charAt(5));
		
		System.out.println(str.indexOf('s'));//1st occurence of s
		
		System.out.println(str.indexOf('s',str.indexOf('s')+2));//2nd occurence of s
		
		System.out.println(str.indexOf("now"));// It will count from where the string started.
		
		System.out.println(str.indexOf("Hello")); //It will return -1 because there is no string 
		
		
	}

}
