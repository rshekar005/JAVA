import java.sql.Array;
import java.util.Arrays;

public class StringConcept 
{

	  
	  public static void main(String args[])
	  {
		  String word = "I am working as a software engineer";
		  
		  String reverse1="";
		  String reverse="";
		 
		  String w[]= word.split("\\s");
		  
		  for(int i=w.length-1;i>=0;i--)
		  {
			  reverse1= reverse1 +w[i] +" ";
		  }
		  System.out.println(reverse1);
		 
			for(int i=word.length()-1; i>=0; i--)
			{
				reverse = reverse+word.charAt(i);
				
			}
			System.out.println(reverse);
			
			
			
	  }

}
