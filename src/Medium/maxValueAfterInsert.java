package Medium;

public class maxValueAfterInsert {
    public static String maxValue(String s, int k) {
        int index = s.length();
        StringBuilder sb = new StringBuilder(s);
        if (s.charAt(0) == '-') {
            if (s.charAt(1)-'0' > k) {
                sb.insert(1, k);
            }
            else {
                for (int i = 2; i <s.length(); i++) {
                    if (s.charAt(i) - '0' > k) {
                        index = i;
                        break;
                    }
                    else{
                        index=sb.length();
                    }
                }
                sb.insert(index , k);
            }

        } else {
            for (int i = 0;i<s.length();i++) {
                if (s.charAt(i) - '0' < k) {
                    index = i;
                    break;
                }
            }
            sb.insert(index, k);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(maxValue("8685" +
                "5",5));
    }
}


