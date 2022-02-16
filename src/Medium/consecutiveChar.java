package Medium;

public class consecutiveChar {
    public int maxPower(String s) {
        int ans=1;
        int c=1;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                c++;
                if(c>ans)
                    ans=c;
                continue;
            }
            c=1;
        }
        return ans;
    }
}
