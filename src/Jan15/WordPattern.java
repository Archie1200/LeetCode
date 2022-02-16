package Jan15;

import java.util.*;

public class WordPattern {
    public static boolean wordPattern(String r, String s) {
        String arr[] = s.split(" ");

        if(arr.length!=r.length()){
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < r.length(); i++) {
            if (map.containsKey(r.charAt(i))) {
                String p = map.get(r.charAt(i));
                if (!p.equals(arr[i])) {
                    return false;
                }
            }
            else if (map.containsValue(arr[i]))
                return false;

            map.put(r.charAt(i), arr[i]);
        }
        return true;
    }
    public static void main(String[] args) {
        String p="abba";
        String q="dog cat cat dog";
        System.out.println(wordPattern(p,q));
        int arr[]={1,2,3,3};
        Majority(arr);
    }
    public static void Majority(int[] arr){
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list= new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        for(Map.Entry p:map.entrySet()){
            if((int)p.getValue()>Math.floor(arr.length/3.0))
            list.add((int)p.getKey());
        }
        System.out.println(list);

    }

}
