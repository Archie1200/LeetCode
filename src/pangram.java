import java.util.HashMap;
import java.util.Map;

public class pangram {
    public boolean checkIfPangram(String s) {
          Map<Character,Integer> map = new HashMap<>();
          String p="abcdefghijklmonpqrstuvwxyz";
          for(int i=0;i<p.length();i++){
              map.put(p.charAt(i),0);
          }
          for(int i=0;i<s.length();i++){
              if(map.containsKey(s.charAt(i)))
                  map.put(s.charAt(i), map.get(s.charAt(i))+1);
          }
          int c=1;
          for(Map.Entry r: map.entrySet()){
              if((int)r.getValue()==0) {
                  c = 0;
                  break;
              }
          }
          if(c==0)
              return false;
          else
              return true;
    }
}
