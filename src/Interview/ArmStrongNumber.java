package Interview;

public class ArmStrongNumber 
{
	//Armstrong Number in Java: A positive number is called armstrong number if it is equal to the sum of cubes of its digits.
	//for example 0, 1, 153, 370, 371, 407 etc.
  public static void isArmstrongNumber(int num)
  {
	  int temp;
	  int remainder=0;
	  int cube=0;
	  
	  temp=num;
	  
	  while(num>0)
	  {
		  remainder=num%10;
		  cube=cube+(remainder*remainder*remainder);
		  num=num/10;
	  }
	  if(cube==temp)
	  {
		  System.out.println(temp +" is an armstrong number");
	  }
	  else
	  {
		  System.out.println(temp +" is not a armstrong number");
	  }  
  }
  
  public static void main(String args[])
  {
	  isArmstrongNumber(153);
  }
}
