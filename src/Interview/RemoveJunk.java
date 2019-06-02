package Interview;

public class RemoveJunk 
{
	public static void main(String args[])
	{
		String s="^$$$%$@$$@$$ Automation Testing Using Selenium *^*&*&*&*&@>:";
		//We Can Remove Junk characters using regular Expressions.
        //Regular Expression to remove special character from a string is [^a-zA-Z0-9]. Here ^ it represent except a-zA-Z0-9 remove all junk letters
		
		s=s.replaceAll("[^a-zA-Z0-9 ]", "");//Replace all is a method present in string which work based on the regular expression.Here given space also
		System.out.println(s);

	}

}
