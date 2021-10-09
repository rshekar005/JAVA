package Interview;

public class ArrayCoins {

	public static void main(String[] args) {
		int a[]= {0,1,1,0};
		int count=0;
		int[] temp = new int[a.length];
		for(int i=0;i<a.length-1;i++) {
			if(!(a[i]+a[i+1]==1)) {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
