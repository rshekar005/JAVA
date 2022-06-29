package Interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int a[]={4,1,5,9,10};
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j< a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(Arrays.toString(a));
        System.out.println("");
        System.out.println("Second largest number in array is "+a[a.length-2]);
        System.out.println(Arrays.stream(Arrays.stream(a).boxed().toArray(Integer[]::new)).collect(Collectors.toList()));
    }
}
