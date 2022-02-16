package Jan15;

import java.util.*;

public class LuckY {
    public int findLucky(int[] arr) {
         Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
         for(int i=0;i<arr.length;i++){
             if(map.containsKey(arr[i]))
                 map.put(arr[i],map.get(arr[i])+1);
             else
                 map.put(arr[i],1);
         }
         for(Map.Entry p:map.entrySet()){
             if((int)p.getKey()==(int)(p.getValue()))
                 list.add((int)p.getKey());
         }
        Collections.sort(list);
         if(list.size()>0)
         return list.get(list.size()-1);
         else
             return -1;
    }
}
