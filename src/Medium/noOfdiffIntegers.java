package Medium;

import java.util.*;

public class noOfdiffIntegers {
    public static void numDifferentIntegers(String s) {
        ArrayList<String> arr2 = new ArrayList<>();
        StringBuilder sb = new StringBuilder(s);
        String arr[] = s.split("[a-z]+");
        for (int i = 0; i < arr.length; i++) {
            if (!arr2.contains(arr[i])) {
                arr2.add(arr[i]);
            }
        }
        arr2.remove(" ");
            arr2.remove("");
        Set<String> set2 = new HashSet<>();

        for(int i=0;i< arr2.size();i++){
            int c=0;
            for(int j=0;j<arr2.get(i).length();j++) {
                 if(arr2.get(i).charAt(j)=='0')
                     c++;
            }
            set2.add(arr2.get(i).substring(c));
        }
        System.out.println(set2.size());
    }

    public static void main(String[] args) {
        numDifferentIntegers("abbb851b0851bcc8510");
    }
}
