package Medium;

import java.util.ArrayList;
import java.util.Arrays;

public class Substringwith1 {
    public static int numSub(String s) {
       ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer>  list=new ArrayList<>();
         int c=0;
         int sum=0;
        for (int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='1')
                c++;
            else{
                arr.add(c);
                c=0;
            }
        }
        arr.add(c);
        for(int i=0;i<arr.size();i++){
            int  n=arr.get(i);
            int  ans=n*(n+1)/2;
            list.add(ans);
        }
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
        }
        sum=sum % (int)(Math.pow(10.0,9.0)+7);
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(numSub("011011"));
    }
}