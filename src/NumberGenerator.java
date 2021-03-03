
public class NumberGenerator {

	public static void mobile()
	{
		String mdn="412312";
        for(int i=1000;i<=1100;i++)
        {
       	 String value=mdn+String.valueOf(i);
       	 System.out.println(value);	
        }
	}
	public static void email()
	{
		String email="goodmoneyqa.";
		for(int i=1;i<=100;i++)
		{
			String emailvalue=email+String.valueOf(i);
			String gmail="@gmail.com";
			//System.out.println(emailvalue+gmail);
		}
	}
	
	public static void ssn()
	{
		String s="2222";
		for(int i=10000;i<=11000;i++)
		{
			String ss=String.valueOf(i)+s;
		//	System.out.println(ss);
		}
	}
	
	public static void main(String[] args) {
         
          mobile();
          //email();
		//ssn();
	}
	

}
