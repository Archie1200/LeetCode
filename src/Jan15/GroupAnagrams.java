package Jan15;

import java.lang.reflect.Array;
import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String str[]={"eat","tea","tan","ate","nat","bat"};
        HashMap<String,List<String>> map = new HashMap<>();
        List<List<String>> finalList= new ArrayList<>();
        for(int i=0;i<str.length;i++){
            char arr[]=str[i].toCharArray();
            Arrays.sort(arr);
            String p=new String(arr);
            if(map.containsKey(p)) {
                map.get(p).add(str[i]);
            }
            else{
                List<String> list= new ArrayList<>();
                list.add(str[i]);
                map.put(p,list);

            }
        }
        finalList.addAll(map.values());
        System.out.println(finalList);

    }


}
