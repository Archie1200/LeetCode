package Jan15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class firstUnique {
    public static int firstUniqChar(String s) {
           Map<Character,Integer> map = new HashMap<>();
          ArrayList<Character> arr = new ArrayList<>();
           for(int i=0;i<s.length();i++){
               if(map.containsKey(s.charAt(i)))
                   map.put(s.charAt(i),map.get(s.charAt(i))+1);
               else
                   map.put(s.charAt(i),1);
           }
           for(Map.Entry p:map.entrySet()){
               if((int)p.getValue()==1) {
                   arr.add((char) p.getKey());
               }
           }
           if(arr.size()==0)
               return -1;
           else {
               int ans = 0;
               for (int i = 0; i < s.length(); i++) {
                  if(arr.contains(s.charAt(i))){
                      ans=i;
                  break;
                       }
                   }

               return ans;
           }
    }

    public static void main(String[] args) {
        String s="loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
