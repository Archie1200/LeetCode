package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class LargestNo {
    public static String largestNumber(int[] arr) {
        String str[] = new String[arr.length];
        for (int i = 0; i < str.length; i++) {
            str[i] = String.valueOf(arr[i]);
        }
            Arrays.sort(str,new Comparator<String>(){
                public int compare(String a,String b){
                    return (b+a).compareTo(a+b);
                }
            });
            StringBuilder sb = new StringBuilder();
            for(String s:str)
                sb.append(s);
            while(sb.charAt(0)=='0' && sb.length()>1)
                sb.deleteCharAt(0);

        return sb.toString();
    }
    public static void main(String[] args) {
        int arr[]={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }
}
