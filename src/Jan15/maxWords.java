package Jan15;

import java.util.ArrayList;
import java.util.Collections;

public class maxWords {
    public int mostWordsFound(String[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
           for(int i=0;i<arr.length;i++){
               String [] str=arr[i].split(" ");
               arr1.add(str.length);
           }
        Collections.sort(arr1);
           return arr1.get(arr1.size()-1);
    }
}
