package Interview;

import java.util.Arrays;

public class ShiftZeroToRight {

	public static void main(String[] args) {
		
		int a[] = {7,6,0,1,3,0,9,0,8};
		int newArray[]= new int[a.length];
		int count=0;
		for(int num :a) {
			if(num!=0) {
				newArray[count]=num;
				count++;
			}
		}
		System.out.println(Arrays.toString(newArray));
	}

}
