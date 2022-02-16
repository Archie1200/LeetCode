import java.util.*;

public class secondDigit {
    public static int secondHighest(String s) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> arr1= new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                arr.add(s.charAt(i)-'0');
            }
        }
        Collections.sort(arr);
        for(int i=0;i<arr.size();i++)
            set.add(arr.get(i));
        Iterator<Integer> p = set.iterator();
        while(p.hasNext()){
            arr1.add(p.next());
        }
        System.out.println(arr1);
        if(set.size()<=1)
            return -1;
        else
            return arr1.get(arr1.size()-2);
    }

    public static void main(String[] args) {
        System.out.println(secondHighest("djdb12321khq"));
    }
}
