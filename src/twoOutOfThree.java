import java.util.*;

public class twoOutOfThree {
    public static int[] twoOutOfThree(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        List<Integer> list= new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            arr1.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (arr1.contains(nums2[i]))
                arr2.add(nums2[i]);
        }
        for(int i=0;i<arr2.size();i++){
            set.add(arr2.get(i));
        }
        Iterator<Integer> p=set.iterator();
        while(p.hasNext()){
            list.add(p.next());
        }
        int arr[]= new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }

    public static void main(String[] args) {

    }
}
