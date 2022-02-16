package Jan15;

import java.util.HashMap;
import java.util.Map;

public class maxNoOfbaloons {
    public int maxNumberOfBalloons(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i),1);
        }
        int b=0,a=0,l=0,o=0,n=0;
        for(Map.Entry p:map.entrySet()){
            if((char)p.getKey()=='b'){
                b=(int)p.getValue();
            }
        else if((char)p.getKey()=='a'){
            a=(int)p.getValue();
        }
            else if((char)p.getKey()=='l') {
                l = (int) p.getValue();
            }
            else if((char)p.getKey()=='o') {
                o = (int) p.getValue();
            }
            else if((char)p.getKey()=='n')
                n=(int)p.getValue();
        }

        return Math.min(b,Math.min(a,Math.min(l/2,Math.min(o/2,n))));

    }
}
