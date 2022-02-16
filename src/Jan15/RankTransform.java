package Jan15;

import java.util.*;

public class RankTransform {
    public static int[] arrayRankTransform(int[] arr) {
        ArrayList<Integer> list= new ArrayList<>();
       int sortedArr[]=arr.clone();
       Map<Integer,Integer> ranked= new HashMap<>();
        Arrays.sort(sortedArr);
       for (int a:sortedArr){
           ranked.putIfAbsent(a, ranked.size()+1);
       }
       for(int i=0;i<arr.length;i++){
           arr[i]=ranked.get(arr[i]);
       }
       return arr;
    }

    public static void main(String[] args) {
        int arr[]={40,10,20,30};
        System.out.println(arrayRankTransform(arr));
    }
}
//TC-O(nlogn)
//SC-O(n)