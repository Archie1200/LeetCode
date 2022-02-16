package Medium;

public class LongestCommon{
    public static int longestCommonSubsequence(String a, String b,int m,int n) {
        if(m==0||n==0)
            return 0;
        if(a.charAt(m-1)==b.charAt(n-1))
            return longestCommonSubsequence(a,b,m-1,n-1)+1;
        return Integer.max(longestCommonSubsequence(a,b,m,n-1),longestCommonSubsequence(a,b,m-1,n));
    }

    public static void main(String[] args) {
        System.out.println(longestCommonSubsequence("psnw","vozsh",4,5));
    }
}
