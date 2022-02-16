package Jan15;

public class wordsType {
    public static int canBeTypedWords(String a, String s) {
           String arr[]=a.split(" ");
           int c=0;
           for(int i=0;i<arr.length;i++){
               for(int j=0;j<s.length();j++)
               if(arr[i].contains(String.valueOf(s.charAt(j)))) {
                   c++;
                   break;
               }
           }
           return arr.length-c;
    }

    public static void main(String[] args) {
        String a="leet code ";
        String s="lt";
        System.out.println(canBeTypedWords(a,s));
    }
}
