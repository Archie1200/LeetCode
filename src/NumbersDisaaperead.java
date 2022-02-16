import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class NumbersDisaaperead {
    public static int findDisappearedNumbers(int[] arr) {
          Map<Integer,Integer> map = new HashMap<>();
          List<Integer> list= new LinkedList<>();
          int n=arr.length;
          for(int i=0;i<n;i++){
              map.put(i,0);
          }
          for(int i=0;i<n;i++){
              if(map.containsKey(arr[i]))
                  map.put(arr[i],map.get(arr[i])+1);
          }
          int s=0;
          for(Map.Entry p:map.entrySet()){
              if((int)p.getValue()==0) {
                   s = (int) p.getKey();
              }
          }
         return s;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,2,5};
        System.out.println(findDisappearedNumbers(arr));
    }
}
