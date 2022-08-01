package Interview;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {
    public static void main(String[] args) {
        String a[]= {"t","r","v"};
        String join = String.join("",a);//output : trv
        System.out.println(join);

        String join1 = String.join("|",a); // output :t|r|v
        System.out.println(join1);

        String joinUsingJava8=Arrays.asList("t","r","y","i","n","g")//t;r;y;i;n;g
                .stream()
                .collect(Collectors.joining(";"));
        System.out.println(joinUsingJava8);

        String str[]={"a","b","c"};
        System.out.println(joinUsingArray(";",str)); //a;b;c

    }

    public static String joinUsingArray(String seperator,String str[]){
        StringBuffer stringBuffer= new StringBuffer();
        int end=0;
        for(String s: str){
            if(s!=null){
                stringBuffer.append(s);
                end=stringBuffer.length();
                stringBuffer.append(";");
            }
        }
        return stringBuffer.substring(0,end);
    }
}
