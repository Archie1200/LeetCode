package Jan15;

import java.util.*;

public class UniqueOccurrences {
    public static boolean uniqueOccurrences(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        for(Map.Entry p:map.entrySet()){
            arr1.add((int)p.getValue());
        }
        for(int i=0;i<arr1.size();i++){
            set.add(arr1.get(i));
        }
        if(set.size()==arr1.size())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,1,1,3};
        System.out.println(uniqueOccurrences(arr));
    }
}
