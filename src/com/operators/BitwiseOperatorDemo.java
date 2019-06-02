package com.operators;

public class BitwiseOperatorDemo 
{
	public static void main(String args[])
	{
		//Bit wise operator convert number to a byte code
		/*
		 * x       y           x&y       x|y         x^y
		 * 1	   1			1		1        	 0
		 * 0		1			0		1            1
		 * 1		0			0		1            1
		 * 0		0			0		0            0
		 */
		//&,!,^,<<,>>
		int num1=11;/* 11 = 00001011 */
		int num2=22;/* 22 = 00010110 */
		int result=0;
		
	result=num1&num2;
	/* num1 & num2 compares corresponding bits of num1 and num2 and generates 1 if both bits are equal, else it returns 0. 
	 * In our case it would return: 2 which is 00000010 because in the binary form of num1 and num2 only second last bits are matching.
	 * 00001011
	 * 00010110
	 * ===========
	 & 000000010     
	 =============== 
	 10==2
	 */       
	System.out.println(result);
	
    result=num1|num2;
    /*num1 | num2 compares corresponding bits of num1 and num2 and generates 1 if either bit is 1, else it returns 0. 
     * In our case it would return 31 which is 00011111
     * 00001011
	 * 00010110
	 * ===========
	 | 00011111 ==16+8+4+2+1=31
	 =============
     * 
     */
    System.out.println(result);
    
    result=num1^num2;
    /*
     * num1 ^ num2 compares corresponding bits of num1 and num2 and generates 1 if they are not equal, else it returns 0. 
     * In our example it would return 29 which is equivalent to 00011101
     * 00001011
	 * 00010110
	 * ===========
     ^ 00011101 ===        16+8+4+0+1=29
     =============
     * 
     */
    System.out.println(result);
    
    result=~num1;
    /*
     * ~num1 is a complement operator that just changes the bit from 0 to 1 and 1 to 0. 
     * In our example it would return -12 which is signed 8 bit equivalent to 11110100
     */
    System.out.println(result);
	}

}
