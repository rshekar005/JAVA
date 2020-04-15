package Interview;

public class SumofDigits {
	public static void main(String args[]) {
		String input = "4572";
		int stringsize = input.length();
		System.out.println("size is " + stringsize);
		int sum = 0;
		int number = 0;
		for (int i = 0; i <= stringsize - 1; i++) {
			char s = input.charAt(i);
			System.out.println("Digit is " + s);
			number = Character.getNumericValue(s);
			sum = sum + number;
			System.out.println(sum);

		}
	}

}
