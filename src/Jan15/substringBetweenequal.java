package Jan15;

import java.util.ArrayList;
import java.util.Collections;

public class substringBetweenequal {
    public  static int maxLengthBetweenEqualCharacters(String s) {
            char arr[]=s.toCharArray();
        ArrayList<Integer> list= new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j])
                        list.add(Math.abs(j-i)-1);
                }
            }
        Collections.sort(list);
            if(list.size()>0)
            return list.get(list.size()-1);
            else
                return -1;
    }

    public static void main(String[] args) {
        String s="abca";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }
}
