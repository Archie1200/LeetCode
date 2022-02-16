import java.util.ArrayList;

public class goodStrings {
    public static int countCharacters(String[] arr, String s) {
        int c=0,d=0;
        ArrayList<Character> arr2 = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            arr2.add(s.charAt(i));
        }
           for(int i=0;i<arr.length;i++){
               c=0;
               for(int j=0;j<arr[i].length();j++){
                   if(arr2.contains(arr[i].charAt(j)))
                       c++;
               }
               if(c==arr[i].length())
                   d+=arr[i].length();
           }
           return d;
    }

    public static void main(String[] args) {
        String arr[]={"cat","bt","hat","tree"};
        System.out.println(countCharacters(arr,"atach"));
    }
}
