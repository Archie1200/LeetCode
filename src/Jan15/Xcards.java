package Jan15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
//wrong
public class Xcards {
    public static boolean hasGroupsSizeX(int[] arr) {
       Map<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i]) + 1);
            else
                map.put(arr[i], 1);
        }
        int c=0;
        int check=map.get(arr[0]);
        for (Map.Entry p : map.entrySet()) {
            if ((int) p.getValue() >= 2 && (int)p.getValue()==check)
                c++;
        }
        if(c==map.size())
            return true;
        else
            return false;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,3,2,1};
        System.out.println(hasGroupsSizeX(arr));
    }
}
