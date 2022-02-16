package Medium;

import java.util.LinkedList;
import java.util.Queue;
//Important
public class AddingSpaces {
    public static String addSpaces(String s, int[] arr) {
           StringBuilder sb = new StringBuilder(s);
           int c=0;
           for(int i=0;i<arr.length;i++){
               sb.insert(arr[i]+c," ");
               c++;
           }
           return sb.toString();
    }

    public static void main(String[] args) {
        int arr[]={8,13,15};
        System.out.println(addSpaces("LeetcodeHelpsMeLearn",arr));
    }
}
