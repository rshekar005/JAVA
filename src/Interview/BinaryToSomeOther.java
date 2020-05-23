package Interview;

public class BinaryToSomeOther {
	
	public static int convertBinaryToDec(int num)
	{
		int decimalnumber=0;
		int remainder=0;
		int i=0;
		while(num!=0)
		{
			remainder= num%10;
			num=num/10;
			//decimalnumber= (int) (decimalnumber + (remainder * Math.pow(2, i)));
			decimalnumber+= remainder*Math.pow(2, i);
			++i;
		}
		return decimalnumber;
	}
	public static void main(String args[])
	{
		System.out.println(convertBinaryToDec(1001));
	}

}
