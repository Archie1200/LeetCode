package Medium;

public class FancyString {
    public static String makeFancyString(String s,int i) {
          if(i==s.length()-2)
              return s;
          if(s.charAt(i)==s.charAt(i+1) && s.charAt(i+1)==s.charAt(i+2)){
              return makeFancyString(s.substring(0,i)+s.substring(i+1),i);
          }
          return makeFancyString(s,i+1);
    }

    public static void main(String[] args) {
        System.out.println((makeFancyString("aaabaaaa",0)));
    }
}
