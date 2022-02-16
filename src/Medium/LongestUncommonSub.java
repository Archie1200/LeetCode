package Medium;

public class LongestUncommonSub {
    public static int findLUSlength(String a, String b) {
               if(a.equals(b))
                   return 0;
               return Math.max(a.length(),b.length());
    }

    public static void main(String[] args) {
        System.out.println(findLUSlength("aa","aaa"));
    }
}
