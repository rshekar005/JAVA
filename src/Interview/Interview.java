package Interview;

public class Interview {
    public static void main(String[] args) {
        String sb="aabbcbbaccbbvbbbbbb";
        char[] c=sb.toCharArray();
        int count=0;
        for(int i=0;i<c.length-1;i++){
            if(c[i]=='b' && c[i+1]=='b'){
                count++;
            }
        }
        System.out.println(count);
    }
}
