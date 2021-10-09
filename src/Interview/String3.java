package Interview;

public class String3 {
	//Count number of Upper case letters
	public static void main(String[] args) {
		String str= "ThisIsCamelCase";
		int count=0;
		//1st way
		char newStr[]=str.toCharArray();
		for(int i=0;i<newStr.length;i++) {
			if(Character.isUpperCase(newStr[i])) {
				count++;
			}
		}
		System.out.println(count);
		
		//2nd way
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>=(char)65 && str.charAt(i)<=(char)90) {
				count++;
			}
		}
		System.out.println(count);
		
		//3rd Way Java 8
		System.out.println(str.chars().filter(i->i>=65 && i<=90).count());
	}

}
