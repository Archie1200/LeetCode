package Medium;

import java.util.ArrayList;

public class nextPermutation {
    public static void nextPer(int[] arr) {
        int n = arr.length;
        int index = -1;
        ArrayList<Integer> list= new ArrayList<>();
        for (int i = n - 1; i > 0; i--) {
            if (arr[i] > arr[i - 1]) {
                index = i - 1;
                break;
            }
        }
        if(index==-1){
            reverse(arr,0,n-1);
            for(int i=0;i<arr.length;i++)
                list.add(arr[i]);
            System.out.println(list);
        }
        else {
            int j = n - 1;
            for (int i = n - 1; i >= index + 1; i--) {
                if (arr[i] > arr[index]) {
                    j = i;
                    break;
                }
            }
            swap(arr, index, j);
            reverse(arr, index + 1, n - 1);

            for (int i = 0; i < arr.length; i++)
                list.add(arr[i]);
            System.out.println(list);
        }
    }
    private static void reverse(int[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    private static void swap(int[] arr,int i,int index){
        int temp=arr[index];
        arr[index]=arr[i];
        arr[i]=temp;
    }

    public static void main(String[] args) {
        int arr[]={3,2,1};
        nextPer(arr);
    }
}
//important