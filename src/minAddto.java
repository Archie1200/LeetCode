public class minAddto {
    public int minAddToMakeValid(String s) {
          int co=0,c=0;
          for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='(')
                  co++;
              else if(co<=0)
                  c++;
              else
                  co--;
          }
          return c+co;
    }

}
