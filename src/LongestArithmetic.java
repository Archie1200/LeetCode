import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestArithmetic {
    public static int longestArithSeqLength(int[] arr) {
        Arrays.sort(arr);
        int arr1[]= new int[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            arr1[i]=arr[i+1]-arr[i];
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr1.length;i++){
            if(map.containsKey(arr1[i]))
                map.put(arr1[i],map.get(arr1[i])+1);
            else
                map.put(arr1[i],1);
        }
        int max=Integer.MIN_VALUE;
        for(Map.Entry p:map.entrySet()){
            if((int)p.getValue()>max)
                max=(int)p.getValue();
        }
        return max+1;
    }

    public static void main(String[] args) {
        int arr[]={20,1,15,3,10,5,8};
        System.out.println(longestArithSeqLength(arr));
    }
}
