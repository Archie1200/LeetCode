package Medium;

public class Truncate {
    public static String truncateSentence(String s, int k) {
        String arr[]= s.split(" ");
        String p="";
        int i=0;
        for(i=0;i<k-1;i++){
            p+=arr[i]+" ";
        }
        p+=arr[k-1];
        return p;
    }

    public static void main(String[] args) {
        System.out.println(truncateSentence("Hello how are you Contestant",4));
    }
}
