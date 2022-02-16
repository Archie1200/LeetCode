package Jan15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class uncommonwords {
    public static String[] uncommonFromSentences(String s1, String s2) {
         String[] arr1 =s1.split(" ");
         String arr2[]= s2.split(" ");
        ArrayList<String> arr3= new ArrayList<>();
        ArrayList<String> arr4= new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            arr3.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            arr3.add(arr2[i]);
        }
        for(int i=0;i<arr3.size();i++){
            if(map.containsKey(arr3.get(i)))
                map.put(arr3.get(i),map.get(arr3.get(i))+1);
            else
                map.put(arr3.get(i),1);
        }
        for(Map.Entry p :map.entrySet()){
            if((int)p.getValue()==1)
                arr4.add((String)p.getKey() );
        }
        String str[]= new String[arr4.size()];
        for(int i=0;i<arr4.size();i++){
            str[i]=arr4.get(i);
        }
        return str;
    }

    public static void main(String[] args) {
        String s1="this apple is sweet";
        String  s2= "this apple is sour";
        System.out.println(uncommonFromSentences(s1,s2));
    }
}
//100% Correct
