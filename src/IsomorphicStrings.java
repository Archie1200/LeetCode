import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
          Map<Character,Integer> map1 = new HashMap<>();
          Map<Character,Integer> map2 = new HashMap<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(map1.containsKey(s.charAt(i)))
                map1.put(s.charAt(i), map1.get(s.charAt(i))+1);
            else
                map1.put(s.charAt(i),1);
        }
        for(int i=0;i<t.length();i++){
            if(map2.containsKey(t.charAt(i)))
                map2.put(t.charAt(i), map2.get(t.charAt(i))+1);
            else
                map2.put(t.charAt(i),1);
        }
        for(Map.Entry p : map1.entrySet()){
            arr1.add((int)p.getValue());
        }
        for(Map.Entry q : map2.entrySet()){
            arr2.add((int)q.getValue());
        }
        if(arr1.equals(arr2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("paper","title"));
    }
}//wrong
