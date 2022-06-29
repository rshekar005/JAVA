package Interview;

public class SecondLastCharacter {
    public static void main(String[] args) {
        String str="Rajashekar";
        System.out.println("Length of the String is "+str.length());
        int i=str.length()-2;
        System.out.println(i);
        char c[]=str.toCharArray();
        System.out.println(c[i]);
    }
}
