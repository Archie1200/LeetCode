package Medium;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class minStepstoAnagram {
    public static int minSteps(String s, String t) {
    Hashtable<Character,Integer> map1 = new Hashtable<>();
    for(int i=0;i<s.length();i++){
        map1.put(s.charAt(i),map1.getOrDefault(s.charAt(i),0)+1);
    }
    for(int i=0;i<t.length();i++){
        map1.put(t.charAt(i),map1.getOrDefault(t.charAt(i),0)-1);
    }
    int sum=0;
    for(char i='a';i<='z';i++){
        if(map1.containsKey(i) && map1.get(i)!=0)
            sum+=Math.abs(map1.get(i));
    }
    return sum/2;
    }

    public static void main(String[] args) {
        System.out.println(minSteps("aba","bab"));
    }
}
