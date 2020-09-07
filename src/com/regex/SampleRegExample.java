package com.regex;

public class SampleRegExample 
{
	public static void main(String args[])
	{
		/*Example: Mobile Number which starts with 7/8/9 upto 10 digits
		regular expression is [7-9][0-9]{9} it is same as [789][0-9]{10}
		Example2: Mobile Number with 10 or 11 digits if it is 11 digits then starting number should be zero
		regular expression is 0?[7-9][0-9]{9}
		Example3: Mobile number can be either 10,11 or 12 digit
		If the number is 12 digits then first two digits should be 91
		(0|91)?[7-9][0-9]{9}
		
		Any Email:
		[a-zA-Z0-9][a-zA-Z0-9]*@[a-zA-z0-9]+([.][a-zA-Z]+)+
	    Only gmail:
	    [a-zA-Z0-9][a-zA-Z0-9]*@gmail[.]com
	    
	    Requirement 
	    1. First character should small character
	    2. Second character should be digit
	    3. 
	    
		
		*/
		
	}

}
