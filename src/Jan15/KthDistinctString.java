package Jan15;

import java.util.*;

public class KthDistinctString {
    public static String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<String> arr1 = new ArrayList<>();
        Set<String> set = new HashSet<>();
        ArrayList<String> arr2= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        for(Map.Entry p: map.entrySet()){
            if((int)p.getValue()==1)
                arr1.add((String)p.getKey());
        }


        String ans="";
        for(int i=0;i<arr.length;i++){
            if(arr1.contains(arr[i]))
                arr2.add(arr[i]);
        }
        int c=0,x=0;
        for(int i=0;i<arr.length;i++){
            if(arr2.contains(arr[i]))
                c++;
            if(c==k) {
                ans = arr[i];
                break;
            }
        }
        if(set.size()<k)
            return "";
        else
        return ans;
    }

    public static void main(String[] args) {
        String arr[]={"b","a","c","a"};
        System.out.println(kthDistinct(arr,2));
    }
}
