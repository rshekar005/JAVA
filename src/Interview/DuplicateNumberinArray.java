package Interview;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumberinArray 
{
	public static void main(String args[])
	{
		String names[]={"Java", "Python", "C","Ruby", "Python","Java"};
		
		//1st approach -- Worst
		for(int i=0;i<names.length;i++)
		{
			for(int j=i+1;j<names.length;j++)
			{
				if(names[i].equals(names[j]))
				{
					System.out.println("Duplicate Element is "+names[i]);
				}
			}
		}
		
		Set<String> store= new HashSet<String>();
		for(String name : names)
		{
			if(store.add(name)==false)
					{
						System.out.println("Finding Duplicate Element Using Set Interface "+name);
					}
		}
	}

}
