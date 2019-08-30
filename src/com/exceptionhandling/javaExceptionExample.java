package com.exceptionhandling;

/**
 * 
 * @author Shekhar
 * Exception Handling is a mechanism which is used to handle runtime errors.
 * Throwable class is a super class of all exceptions.
 * suppose in a program contains error in the middle. It will execute upto the error and rest of the code will not execute. To Over come this Exception Handling concept is used.
 * 
 * 3 type's of Exception handling:
 * 1. Checked Exception:
 *    Exception which are raised at the time of compile time is called checked exception. It inherit Throwable class.
 *    Example: SQLException, IOException, ClassNotFoundException.
 *  
 * 2. Unchecked Exception:
 *    Exceptions whic are raised at the time of runtime is called unchecked exception.
 *    Example: ArrayIndexOutOfBoundException, NumberFormatExceptions etc.
 *    
 * 3. Error:
 *    Error is irrecoverable e.g. OutOfMemoryError, VirtualMachineError, AssertionError etc.
 *    
 * Rule: For each try block there can be zero or more catch blocks, but only one finally block.
 * 
 * Note: The finally block will not be executed if program exits(either by calling System.exit() or by causing a fatal error that causes the process to abort).
 * 
 * Java finally block is a block that is used to execute important code such as closing connection, stream etc.

   Java finally block is always executed whether exception is handled or not.

   Java finally block follows try or catch block.
   
   Throws Keyword:
   The Java throws keyword is used to declare an exception. It gives an information to the programmer that there may occur an exception so it is better for the programmer to provide the exception handling code so that normal flow can be maintained.
   Exception Handling is mainly used to handle the checked exceptions. If there occurs any unchecked exception such as NullPointerException, it is programmers fault that he is not performing check up before the code being used.
   
   Throw Keyword:
   The Java throw keyword is used to explicitly throw an exception.

We can throw either checked or unchecked exception in java by throw keyword. 
 *    
 */
public class javaExceptionExample 
{
	public static void main(String args[])
	{
	try
	{
		/*int num= 100;
		System.out.println(num/0);// Arithmetic Exception
*/		try
		{
			try
			{
				
				int a[]= new int[5];
				System.out.println(a[7]=10);// ArrayIndexOutOfBoundException
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.out.println(a);
			}
		}
		finally
		{
			System.out.println("Finally block Executed");
		}
	}

	catch(Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("Rest of the code will execute");
	}

}
