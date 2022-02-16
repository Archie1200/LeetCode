package Jan15;

import java.util.Arrays;

public class diff {
    public static char findTheDifference(String s, String t) {
             char arr1[]=s.toCharArray();
        Arrays.sort(arr1);
        char arr2[]=t.toCharArray();
        Arrays.sort(arr2);
        String a=new String(arr1);
        String b= new String(arr2);
        char ch=0;
        if(a.length()==0)
            ch=b.charAt(0);
        else {
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    ch = b.charAt(i);
                    break;
                }
                else
                    ch = b.charAt(a.length());
            }
            return ch;
        }
        return ch;
    }

    public static void main(String[] args) {
        String s="pink";
        String t="pijnk";
        System.out.println(findTheDifference(s,t));
    }
}
