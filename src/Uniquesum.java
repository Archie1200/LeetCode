import java.util.*;

public class Uniquesum{
    public static int sumOfUnique(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else map.put(arr[i],1);
        }
        int sum1=0;
        for(Map.Entry p: map.entrySet()){
            if((int)p.getValue()==1){
                sum1+=(int)p.getKey();
            }
        }
        return sum1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2};
        System.out.println(sumOfUnique(arr));
    }
}
