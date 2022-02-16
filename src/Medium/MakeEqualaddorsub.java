package Medium;

import java.util.Arrays;

public class MakeEqualaddorsub {
    public static int minMoves2(int[] arr) {
        Arrays.sort(arr);
        int median=0;
        int n=arr.length-1;
        if(arr.length%2==0)
            median=(arr[n/2]+arr[(n-1)/2])/2;
        else
            median=arr[n/2];
        int ans=0;
        for(int i=0;i<=n;i++){
            ans+=Math.abs(median-arr[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,0,0,8,6};
        System.out.println(minMoves2(arr));
    }

}
