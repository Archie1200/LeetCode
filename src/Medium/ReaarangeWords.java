package Medium;

import java.util.*;

//doubt
public class ReaarangeWords {
    public static String arrangeWords(String s) {
        String str[]=s.split(" ");
        Arrays.sort(str, Comparator.comparingInt(String::length));
        String p="";
        for(int i=0;i<str.length;i++){
            p+=str[i]+" ";
        }
        String result=String.valueOf(p.charAt(0)).toUpperCase()+p.substring(1).toLowerCase();
        return result.trim();
    }

    public static void main(String[] args) {
        System.out.println(arrangeWords("To be or not to be"));
    }
}
