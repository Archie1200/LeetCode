package Medium;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;

public class KthLargest {
    public static String kthLargestNumber(String[] arr, int k) {
        ArrayList<BigInteger> arr1= new ArrayList<>();
        for(int i=0;i<arr.length;i++) {
            BigInteger b= new BigInteger(arr[i]);
            arr1.add(b);
        }
        Collections.sort(arr1);
        String p=String.valueOf(arr1.get(arr1.size()-k));
        return p;
    }

    public static void main(String[] args) {
        String arr[]={"3897394230","6777777","74437483748","104348324"};
        System.out.println(kthLargestNumber(arr,2));
    }
}
