package Medium;

public class multipliyComplex {
    public static String complexNumberMultiply(String s1, String s2) {
         int a=Integer.parseInt(s1.substring(0, s1.indexOf("+")));
         int b=Integer.parseInt(s1.substring(s1.indexOf("+")+1, s1.length()-1));
         int c=Integer.parseInt(s2.substring(0,s2.indexOf("+")));
         int d=Integer.parseInt(s2.substring(s2.indexOf("+")+1,s2.length()-1));
         return  (a*c-b*d)+ "+" + (a*d+c*b) +"i";
    }

    public static void main(String[] args) {
        System.out.println(complexNumberMultiply("1+1i","1+1i"));
    }
}
