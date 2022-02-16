package Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class firstLast {
    public int[] searchRange(int[] arr, int target) {
        ArrayList<Integer> arr1= new ArrayList<>();
        int arr2[]= new int[2];
        for(int i=0;i<arr.length;i++){
            arr1.add(arr[i]);
        }
        if(arr1.size()==0) {
            arr2[0] = -1;
            arr2[1]=-1;
        }
        else {
            int ans1 = arr1.lastIndexOf(target);
            int ans2 = 0;
            for (int i = 0; i < arr1.size(); i++) {
                if (arr1.get(i) == target) {
                    ans2 = i;
                    break;
                } else {
                    ans2 = -1;
                }
            }
            arr2[0]=ans2;
            arr2[1]=ans1;
        }

        return arr2;
    }

    public static void main(String[] args) {
        int nums[]={2,0,2,1,1,0};
        ArrayList<Integer> arr = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(String.valueOf(nums));
    }
}
//how to do with O(logn)?