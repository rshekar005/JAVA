package Interview;

//Positive Numbers is nothing but Natural Number but 0 is not a natural number
public class SumOfNaturalNumbers {
	
	public static void main(String args[])
	{
		System.out.println(add(5));//5+4+3+2+1
	}
	
	public static int add(int num)
	{
		if(num!=0)
		{
			return num+add(num-1);
		}
		else
		{
			return num;
		}
	}

}
