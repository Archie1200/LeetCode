package Medium;

public class ValidPalindromeSub {
    public boolean validPalindrome(String s) {
         int i=0,j=s.length()-1;
         while(i<j-1){
             if(s.charAt(i)!=s.charAt(j)){
                 if(palindromeCheck(s,i,j-1))
                     return true;
                 if(palindromeCheck(s,i+1,j))
                     return true;
                 return false;
             }
             else{
                 i++;
                 j--;
             }
         }
         return true;
    }
    public static boolean palindromeCheck(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
