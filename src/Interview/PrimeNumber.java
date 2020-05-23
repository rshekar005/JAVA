package Interview;

public class PrimeNumber 
{
	public static boolean isPrimeNumber(int num)// It return true if value is prime. Other wise false.
	{
		//2 is the lowest prime number. 
		//Prime Numbers : Number which is divisible by itself and 1 is called prime number.
		if(num<=1)
		{
			return false;
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;	
	}
	public static void getPrimeNumbers(int num)//This method is used to get number of prime numbers between given number
	{
		for(int i=2;i<=num;i++)
		{
			if(isPrimeNumber(i))
			{
				System.out.println(i);
			}
		}
	}
	public static void main(String args[])
	{
		//System.out.println(isPrimeNumber(2));
        System.out.println(isPrimeNumber(8));	
      //  getPrimeNumbers(20);
	}

}
