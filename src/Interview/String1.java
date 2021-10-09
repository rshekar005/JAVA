package Interview;

public class String1 {

	public static void main(String[] args) {
		String str= "Ind12ia45";
		char[] ch=str.toCharArray();
		String alphabets = "";
		String number = "";
		for(int i=0;i<ch.length;i++) {
			if(Character.isLetter(ch[i])) {
				alphabets=alphabets+ch[i];
			}
			else {
				Character.isDigit(ch[i]);
					number=number+ch[i];
			}
		}
		System.out.println("Aplhabets are :" +alphabets);
		System.out.println("Numbers are :"+number);
		
		System.out.println(alphabets+number);
	}

}
