package Jan15;

import java.util.HashMap;
import java.util.Map;

public class AllequalFreq {
    public static boolean areOccurrencesEqual(String s) {
              Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        int p=map.get(s.charAt(0));
        for(Map.Entry a:map.entrySet()){
            if((int)a.getValue()!=p) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(areOccurrencesEqual("abcabc"));
    }
}
