import java.util.HashMap;
import java.util.Map;

public class n_repeat {
    public static int repeatedNTimes(int[] arr) {
         int n=arr.length/2;
         Map<Integer,Integer> map = new HashMap<>();
         for(int i=0;i<arr.length;i++){
             if(map.containsKey(arr[i]))
                 map.put(arr[i],map.get(arr[i])+1);
             else
                 map.put(arr[i],1);

         }
         int ans=0;
         for(Map.Entry p :map.entrySet()){
             if((int)p.getValue()==n)
                 ans=(int)p.getKey();
         }
         return ans;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3};
        System.out.println(repeatedNTimes(arr));
    }
}
