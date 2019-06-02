package Interview;

public class StringOdd 
{
	public static void main(String args[])
	{
		String str="TEST RANK";
		//TS ET AK RN
       String str2=str.replaceAll("\\s", "");
		int len=str2.length();
		System.out.println(len);
		for(int i=0;i<=str2.length()-1;i++)
		{

			if(i%2==0)
			{
            	System.out.print(str2.charAt(i));	
			}
		}
		System.out.print(" ");
		for(int j=0;j<=str2.length()-1;j++)
		{
			if(j%2!=0)
			{
				System.out.print(str2.charAt(j));
				
			}
		}
		
	}

}
