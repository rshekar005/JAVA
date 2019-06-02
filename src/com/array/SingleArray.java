package com.array;

public class SingleArray 
{
	
	/* Array is a collection of similar types of data types.-- it can be achieved using Object. It will store any type of data type object.
	 * limitation of Array is it is fixed length
	 */
public static void main(String[] args)
{
	int a[]= new int[5];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
//	a[5]=60; ==> Throws array index out of bound exception
	System.out.println(a.length);// Length is 5
for(int i=0;i<=a.length-1;i++)// a.length=5; but here we are initializing from 0. from 0 to 5 it will repeat upto to 6 times. Then it will throw ArrayIndexOutofBoundExcpetion.
{
	System.out.println(a[i]);
}
     System.out.println("********************************************");
     
      int b[]={100,200,300,400};
     System.out.println(b.length);// It gives length of an array 
  for(int j=0;j<=b.length-1;j++)
  {
	 System.out.println(b[j]);
  }
  
  for(int c:b)//Especillay used for arrays , list .Here we don't have Declaration, condition, increment.
  {
	  System.out.println("Reading data using enhanced for loop " +c);
  }
  System.out.println("*****************************");
  System.out.println(b[2]);// reads a specific value
	
}
}
