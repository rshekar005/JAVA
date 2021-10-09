package Interview;

public class SortCharacters 
{
	//output: AaBbCcDd
	public static void main(String args[])
	{
		String input="AbBCdcaD";
		char[] charArray= input.toCharArray();
		System.out.println(charArray);
		String output="";
		for(int i=0;i<charArray.length;i++)
		{
			int ASCII= charArray[i];
			if(ASCII<97)
			{
				output=output+charArray[i];
			}
			
			for(int j=0;j<charArray.length;j++)
			{
				if(i!=j)
				{
					int ASCIInew= charArray[j];
					if(ASCII+32==ASCIInew)
					{
						output=output+charArray[j];
						break;
					}
				}
			}
		}
		System.out.println(output);
	}
	

}
