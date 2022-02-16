package Jan15;

import java.util.ArrayList;

public class PlusOne {
    public int[] plusOne(int[] arr) {
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]<9) {
                arr[i]++;
                return arr;
            }
            arr[i]=0;
        }
        int[] arr1= new int[arr.length+1];
        arr1[0]=1;
        return arr1;
    }
}
