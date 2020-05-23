package Interview;

public class Factor {

	public static void main(String[] args) {
		
		int num=60;
		
		for(int i=1;i<=60;i++)
		{
			if(num%i==0)
			{
				System.out.println("Fators of " +num+ " is " +i);
			}
		}

	}

}
