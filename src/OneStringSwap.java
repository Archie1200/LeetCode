import java.util.Arrays;

public class OneStringSwap {
    public static boolean areAlmostEqual(String s1, String s2) {
        char arr1[]=s1.toCharArray();
        char arr2[]=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
            if(s1.equals(s2))
                return true;
            else if(s1.length()==s2.length()){
                int c=0;
                for(int i=0;i<s1.length();i++){
                    if(s1.charAt(i)!=s2.charAt(i))
                        c++;
                }
                if(c==2 && Arrays.equals(arr1,arr2))
                    return true;
                else
                    return false;
            }
            else
                return false;
    }

    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank","kanb"));
    }
}
