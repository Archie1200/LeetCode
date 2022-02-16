package Medium;


//important
public class revWords3 {
    public static String reverseWords(String s) {
     String[] arr =s.split(" ");
     String ans="";
     for(int i=0;i<arr.length;i++){
         StringBuilder p = new StringBuilder(arr[i]);
         p.reverse();
         ans+=p.toString()+" ";
     }
     return ans.trim();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
