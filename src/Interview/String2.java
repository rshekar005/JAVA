package Interview;

import java.util.Arrays;

public class String2 {
	public static void main(String[] args) {
		String str= "To$day is Wed#nesday";
		//We$dnesday is# Today
		String newStr=str.replaceAll("[^a-zA-z0-9 ]", ""); //Removing special characters from the string excluding space
		StringBuffer sb = new StringBuffer();
		String[] split=newStr.split(" ");
		for(int i=split.length-1;i>=0;i--) {
			 sb.append(split[i]+" ");
		}
		String s=sb.toString(); // converting stringBuffer to String
		char[] c=str.toCharArray();
		for(int i=0;i<c.length;i++) {
			if(!(Character.isLetter(c[i]) || c[i]==' ')){
				s=s.substring(0,i)+String.valueOf(c[i])+s.substring(i);
			}
		}
		System.out.println(s);
	}

}
