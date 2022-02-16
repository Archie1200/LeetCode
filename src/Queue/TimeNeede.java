package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class TimeNeede {
    public static int timeRequiredToBuy(int[] arr, int k) {
       Queue<Integer> q= new LinkedList();
       for(int i=0;i<arr.length;i++){
           q.add(i);
       }
       int p=0,c=0,ans=0;
      while(arr[k]>0) {
          p = q.remove();
          arr[p]--;
          c++;
          if (arr[p] > 0)
              q.add(p);
      }
       return c;

    }

    public static void main(String[] args) {
        int arr[]={5,1,1,1};
        System.out.println(timeRequiredToBuy(arr,0));
    }
}
