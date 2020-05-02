package Interview;

public class AlphabetCheck {

	public static void main(String[] args) {
		char c='$';
		if((c>='a' && c<='z') || (c>='A' && c<='z'))
		{
			System.out.println(c+ " is an alphabet");
		}
		else
		{
			System.out.println(c+ " is not an alphabet");
		}

	}

}
