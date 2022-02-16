import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class BackSpaceStrings {
    public static boolean compare(String s ,String t){
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2= new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(st1.size()>0 && s.charAt(i)=='#' )
                st1.pop();
            else
                st1.push(s.charAt(i));
        }
        while(st1.size()>0){
            arr1.add(st1.pop());
        }
        for(int i=0;i<t.length();i++){
            if(st2.size()>0 && t.charAt(i)=='#')
                st2.pop();
            else
                st2.push(t.charAt(i));
        }
        while(st2.size()>0){
            arr2.add(st2.pop());
        }
        Collections.reverse(arr1);
        Collections.reverse(arr2);
        for(int i=0;i<arr1.size();i++){
            if(arr1.get(i)=='#')
                arr1.remove(i);
        }
        for(int i=0;i<arr2.size();i++){
            if(arr2.get(i)=='#')
                arr2.remove(i);
        }
        if(arr1.equals(arr2))
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        System.out.println(compare("y#fo##f","y#f#o##f"));
    }
}
//100 % Correct
