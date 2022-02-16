package Jan15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class twice {
    public List<Integer> findDuplicates(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        for(Map.Entry p: map.entrySet()){
            if((int)p.getValue()==2)
                list.add((int)p.getKey());
        }
        return list;
    }
}
