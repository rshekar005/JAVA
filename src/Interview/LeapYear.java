package Interview;

public class LeapYear {

	public static void main(String[] args) {
		
		//divisible by 4 is a century year -- is a century year
		//century year is a leap year only when its perfectly divisble by 400
		
		int year=1900;
		boolean leap =false;
		if(year % 4 == 0)
		{
			if(year%100==0)
			{
				if(year%400==0)
				{
					leap=true;
				}
				else
				{
					leap=false;
				}
			}
			else
			{
				leap=true;
			}
		}
		else
		{
			leap=false;
		}
		if(leap)
		{
			System.out.println(year+" is a leap year");
		}
		else
		{
			System.out.println(year + "is not a leap year");
		}

	}

}
