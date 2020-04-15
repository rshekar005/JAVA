package Interview;

public class SquarePattern 
{

	public static void main(String args[])
	{
		System.out.println("*****Square Pattern***********");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)//If i<=4 control moves to j forloop and it will exeute all the conditions in j loop till the expression matches and it will come out j for loop if not.
				
			{
				//Here if we use println then control goes to next line. Hence used print to print output in same line
			//System.out.print(j +" ");
			
			System.out.print(j+ " ");
				
			}
			System.out.println();
		}
			System.out.println("*********flooyd Triangle**********");//If j for loop executed the control will go to next line
			for(int a=1;a<=4;a++)
			{
				for(int b=1;b<=a;b++)
				{
					System.out.print(b +" ");//If we place b instead of * it will print integers
					
				}
				
				System.out.println();
			}
		}
}
	 

	

