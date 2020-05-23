package Interview;

import java.util.Scanner;

public class Calculator 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter two numbers ");
		double first= sc.nextDouble();
		double second=sc.nextDouble();
		
		System.out.println("Enter an Operator (+,-,*,%,/)");
		
		char operator= sc.next().charAt(0);
		
		double result = 0;
		
		switch (operator) {
		case '+':
			result=first+second;
			break;
		case '-':
			result=first-second;
			break;

		case '*':
			result=first*second;
			break;

		case '/':
			result=first/second;
			break;

		case '%':
			result=first%second;
			break;


		default:
			System.out.println(" Please enter a valid operator ");
			break;
			
		
		}
		System.out.println(result);
		
	}

}
