import java.util.ArrayList;

public class ArrayThirdPractical
{
    public int[] twoSum(int[] arr, int target) {
        ArrayList<Integer> arr1 = new ArrayList<>();
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]+arr[j]==target) {
                        arr1.add(i);
                        arr1.add(j);
                    }
                }
            }
            int arr3[]= new int[arr1.size()];
            for(int i=0;i<arr3.length;i++){
                arr3[i]=arr1.get(i);
            }
            return arr3;
    }
}
