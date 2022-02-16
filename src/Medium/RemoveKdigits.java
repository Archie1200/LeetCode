package Medium;

import java.util.ArrayList;
import java.util.Collections;

public class RemoveKdigits {
    public static String removeKdigits(String s, int k) {
        if(s.length()==k)
            return "0";
        StringBuilder sb = new StringBuilder(s);
        for(int j=0;j<k;j++){
            int i=0;
            while(i<sb.length()-1 && sb.charAt(i)<=sb.charAt(i+1))
                i++;
            sb.delete(i,i+1);
        }
        int i=0;
        while(i<sb.length()-1 && sb.charAt(i)=='0')
            i++;
        return sb.toString().substring(i);
    }


    public static void main(String[] args) {
        System.out.println(removeKdigits("1234567890",2));
    }
}
