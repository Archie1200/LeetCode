import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class removeDuplicates {
    public static String removeDuplicateLetters(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        String st="";
        for(Map.Entry p:map.entrySet()){
            arr.add((char)p.getKey());
        }
        for(int i=0;i<arr.size();i++){
            st+=arr.get(i);
        }
        return st;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicateLetters("aabcddc"));
    }
}
