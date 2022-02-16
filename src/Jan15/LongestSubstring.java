package Jan15;

public class LongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        String p = "";
        int maxL = -1;
        if (s.isEmpty())
            return 0;
        else if (s.length() == 1)
            return 1;
        for (char c : s.toCharArray()) {
            String str = String.valueOf(c);
            if (p.contains(str)) {
                p = p.substring(p.indexOf(str) + 1);

            }
            p = p + String.valueOf(c);
            maxL=Math.max(p.length(),maxL);
            System.out.println(p);
        }
        return maxL;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
}
//Important