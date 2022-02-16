package Jan15;

import java.util.HashMap;
import java.util.Map;

public class RedistributeToEqual {
    public static boolean makeEqual(String[] arr) {
        String s="";
           for(int i=0;i<arr.length;i++){
               s+=arr[i];
           }
           Map<Character,Integer> map = new HashMap<>();
         for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
         int c=0;
        int r=map.get(s.charAt(0));
        for(Map.Entry p:map.entrySet()){
            if((int)p.getValue()==r)
                c++;
        }
        if(c==map.size() && c==arr.length)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        String arr[]={"ab","a","b"};
        System.out.println(makeEqual(arr));
    }
}
