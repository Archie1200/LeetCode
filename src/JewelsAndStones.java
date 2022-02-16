import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JewelsAndStones {
    public  static int numJewelsInStones(String jewels, String stones) {
        int c=0;
        ArrayList<Character> arr = new ArrayList<>();
        for(int i=0;i<stones.length();i++){
            arr.add(stones.charAt(i));
        }

        for(int i=0;i< jewels.length();i++){
            int x=0;
            while(x!=arr.size()) {
                if (jewels.charAt(i) == arr.get(x))
                    c++;
                x++;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA","aAAbbbb"));
    }
}
