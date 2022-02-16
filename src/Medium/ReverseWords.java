package Medium;
//important
public class ReverseWords {
    public static String reverseWords(String a) {
        String s=a.replaceAll("( )+"," ");// to remove between extra spaces
       String arr[]=s.split(" ");
       String p="";
       for(int i=arr.length-1;i>=1;i--){
           p+=arr[i]+" ";
       }
       p+=arr[0];
       return p.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("  The sky    is blue  "));
    }
}
