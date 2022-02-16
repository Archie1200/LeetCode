package Jan15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingsAndRods {
    public static void countPoints(String s) {
       int r[]= new int[10];
       int g[]= new int[10];
       int b[]= new int[10];
       for(int i=0;i<s.length();i+=2){
           int a=s.charAt(i+1)-'0';
           if(s.charAt(i)=='R')
               r[a]++;
           else if(s.charAt(i)=='G')
               g[a]++;
           else
               b[a]++;
       }
       int c=0;
       for(int i=0;i<10;i++){
           if(r[i]>0 && g[i]>0 && b[i]>0)
               c++;
       }
        System.out.println(c);
    }

    public static void main(String[] args) {
        countPoints("B0B6G0R6R0R6G9");
    }
}
