package Medium;

import java.util.ArrayList;

public class LongestPalindrome {
    public static String longestPalindrome(String s) {
        int c=0;
        ArrayList<String> arr = new ArrayList<>();
         for(int i=0;i<s.length();i++){
             for(int j=i;j<s.length();j++){
                 if(palindromeCheck(s.substring(i,j+1))) {
                     c++;
                     arr.add(s.substring(i, j + 1));
                 }
             }
         }
        //System.out.println(c);
         int max=Integer.MIN_VALUE;
         String Smax="";
         for(int i=0;i<arr.size();i++){
             if(arr.get(i).length()>max) {
                 max = arr.get(i).length();
                 Smax=arr.get(i);
             }
         }
         return Smax;

    }
    public static boolean palindromeCheck(String t){
        boolean flag=true;
        for(int i=0;i< t.length();i++){
            if(t.charAt(i)!=t.charAt(t.length()-i-1)){
                flag=false;
                break;
            }
        }
        if(flag)
            return true;
        else
            return false;
    }
//doubt
    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
    }
}
