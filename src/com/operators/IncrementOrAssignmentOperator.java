package com.operators;

public class IncrementOrAssignmentOperator 
{
	
	public static void main(String args[])
	{
		int num1=10;
		int num2= 20;
		
		/*System.out.println((num2=num1));// It will assign value of num1 to num2
		System.out.println(num2 += num1); // 
*/		
		   
        System.out.println("Assignment Operator");
        
        System.out.println(num2=num1);//num1 value is assigned to num2 ==10
        System.out.println(num2 += num1);// num2= num2 + num1 =10+10
        System.out.println(num2 -= num1);// num2 = num2- num1 =20-10
        System.out.println(num2 %= num1);  // num2 = num2%num1  (Remainder) =10%10
        System.out.println(num2 /= num1);  // num2/num1  (Quotient)=0/10 =0
		
		System.out.println("Increment or Decrement Operator");
		num1++;
		num2--;
        System.out.println(num1);
        System.out.println(num2);
        
     
		
	}

}
