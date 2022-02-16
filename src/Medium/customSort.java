package Medium;

public class customSort {
    public static String sort(String s,String t){
        int arr[]= new int[26];
        for(char c:t.toCharArray()){
            ++arr[c-'a'];
        }
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            while(arr[c-'a']-- >0)
                sb.append(c);
        }
        for(char c='a';c<='z';c++){
            while(arr[c-'a']-- >0)
                sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(sort("cba","abcd"));
    }
}
