package Jan15;

import java.util.HashSet;
import java.util.Set;

public class distribute {
    public int distributeCandies(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return Math.min(set.size(),arr.length/2);
    }
}
