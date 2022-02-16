package Jan15;

import java.util.ArrayList;
import java.util.Collections;

public class maxCo {
    public static int findMaxConsecutiveOnes(int[] arr) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1)
                c++;
            else{
                if(c!=0)
                    arr1.add(c);
                c=0;
            }
            arr1.add(c);
        }
        Collections.sort(arr1);
        return arr1.get(arr1.size()-1);
    }

    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}
