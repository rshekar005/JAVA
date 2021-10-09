package Interview;

public class StringVowel {
	public static void main(String[] args) {
		String str="this is rohit";
		char[] c=str.toCharArray();
		String newString = "";
		for(int i=0;i<c.length;i++) {
			if(c[i]=='a' || c[i]=='e' || c[i]=='i' || c[i]=='o' || c[i]=='u') {
				newString=newString+c[i+1]+c[i];
				i++;
				
			}else {
				newString= newString + c[i];
			}
		}
		System.out.println(newString);
	}

}
