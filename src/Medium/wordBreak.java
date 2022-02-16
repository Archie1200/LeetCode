package Medium;

import java.util.*;

public class wordBreak {
    public static boolean word(String s, List<String> arr) {
        String p="";
        Set<Character> set1= new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(int i=0;i<arr.size();i++){
            p+=arr.get(i);
        }
        for(int i=0;i<p.length();i++){
            set1.add(p.charAt(i));
        }
        for(int i=0;i<s.length();i++){
            set2.add(s.charAt(i));
        }
        String a1="",b1="";
        Iterator<Character> a= set1.iterator();
        while(a.hasNext()){
            a1+=a.next();
        }
        Iterator<Character> b = set2.iterator();
        while(b.hasNext()){
            b1+=b.next();
        }
        int c=0;
        for(int i=0;i<b1.length();i++){
            for(int j=0;j<a1.length();j++){
                if(b1.charAt(i)==a1.charAt(j))
                    c++;
            }
        }
        if(c==b1.length())
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        List<String > list= new ArrayList<>();
        String arr[]={"apple","pen"};
        for(int i=0;i<arr.length;i++)
            list.add(arr[i]);
        System.out.println(word("applepenapple",list));
    }
}
