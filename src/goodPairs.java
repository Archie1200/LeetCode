import java.util.HashMap;
import java.util.Map;

public class goodPairs {
    /*public static int numIdenticalPairs(int[] arr) {
           int c=0;
           for(int i=0;i<arr.length;i++){
               for(int j=i+1;j<arr.length;j++){
                   if(arr[i]==arr[j])
                       c++;
               }
           }
           return c;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
     */
    public static int majority(int arr[]){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i]))
                map.put(arr[i],map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }
        int max=Integer.MIN_VALUE,maxNo=0;
        for(Map.Entry p :map.entrySet()){
            if((int)p.getValue()>max) {
                max = (int) p.getValue();
                maxNo=(int)p.getKey();
            }
        }
        return maxNo;
    }
}
