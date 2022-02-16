package Medium;

import java.util.LinkedList;
import java.util.Queue;

public class Reorganise {
    public static String reorganizeString(String s) {
          Queue<Character> q = new LinkedList<>();
          for(int i=0;i<s.length();i++){
              q.add(s.charAt(i));
          }
          int c=0;
          String d="";
          while(c!=q.size() && q.size()!=0){
              char p=q.remove();
              if(p==q.peek()){
                  q.add(p);
                  c++;
              }
              else {
                  d+=p;
                  c++;
              }
          }
          String s1="";
          s1=d;
          while(q.size()!=0)
              s1+=q.remove();
          for(int i=0;i<s1.length()-1;i++){
              if(s1.charAt(i)==s1.charAt(i+1))
                  return "";
          }
        return s1;
    }

    public static void main(String[] args) {
        System.out.println(reorganizeString("aaab"));
    }
}
