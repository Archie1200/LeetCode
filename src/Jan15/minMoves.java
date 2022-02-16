package Jan15;

import java.util.Arrays;

public class minMoves {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3};
        Arrays.sort(arr);
        int ans=0;
        for(int i =0 ;i<arr.length;i++){
            ans+=arr[i]-arr[0];
        }
        System.out.println(ans);
    }
}
