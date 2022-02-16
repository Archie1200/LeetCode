package Medium;

import java.util.*;
//most important
public class topK {
    public static Object topKFrequent(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        List<String> list2= new ArrayList<>();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        if (set.size() == arr.length) {
            for(int i=0;i<arr.length;i++)
                list2.add(arr[i]);
            return list2;
        }
        else {
            int c = 0;
            for (int i = 0; i < arr.length; i++) {
                if (map.containsKey(arr[i]))
                    map.put(arr[i], map.get(arr[i]) + 1);
                else
                    map.put(arr[i], 1);
            }
            arr1.addAll(map.values());
            Collections.sort(arr1);
            Collections.reverse(arr1);
            for (int i = 0; i < arr1.size(); i++) {
                arr2.add(arr1.get(i));
                c++;
                if (c == k)
                    break;
            }
            List<String> arr3 = new ArrayList<>();
            for (int i = 0; i < arr2.size(); i++) {
                for (Map.Entry p : map.entrySet()) {
                    if ((int) p.getValue() == arr2.get(i) && !arr3.contains((String) p.getKey())) {
                        arr3.add((String) p.getKey());

                    }
                }
            }
            Collections.sort(arr3);
            return arr3;
        }
    }


    public static void main(String[] args) {
        String arr[] = {"i","love","leetcode","i","love","coding"};
        int k=2;
        System.out.println(topKFrequent(arr,k));
    }
}


//100% correct