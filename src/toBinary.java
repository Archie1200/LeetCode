import java.math.BigInteger;
//Important
public class toBinary {
    public static void main(String[] args) {
        String a="11000000000101";
        String b="11010100100101";
        BigInteger c = new BigInteger(a,2);
        BigInteger d = new BigInteger(b,2);
        BigInteger temp=c.add(d);
        String result=temp.toString(2);
        System.out.println(result);
    }
}
