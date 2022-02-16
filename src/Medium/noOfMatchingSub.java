package Medium;

public class noOfMatchingSub {
    public static int numMatchingSubseq(String s, String[] arr) {
        int c=0;
          for(int i=0;i<arr.length;i++){
              if(checkSubsequence(s,arr[i]))
                  c++;
          }
          return c;
    }
    public static boolean checkSubsequence(String a,String b){
        int j=0;
        for(int i=0;i<a.length()&& j<b.length();i++){
            if(a.charAt(i)==b.charAt(j))
                j++;
        }
        if(j==b.length())
            return true;
        return false;
    }

    public static void main(String[] args) {
        String arr[]={"a","bb","acd","ace"};
        System.out.println(numMatchingSubseq("abcde",arr));
    }
}
