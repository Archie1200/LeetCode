package Medium;

import java.util.Stack;

public class RemoveAdjacentDup {
    /*public  static String removeDuplicates(String s, int k) {
          for(int i=1,c=1;i<s.length();i++){
              if(s.charAt(i)==s.charAt(i-1))
                  c++;
              else
                  c=1;
              if(c==k){
                  s=removeDuplicates(s.substring(0,i-k+1)+s.substring(i+1),k);
              }
          }
          return s;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("deeedbbcccbdaa",3));
    }
     */
    public static String removeDuplicates(String s,int k){
        char arr[]=s.toCharArray();
        int i,j;
        Stack<Integer> st = new Stack<>();
        st.add(0);
        for(i=1,j=1;j<s.length();i++,j++){
            char c=arr[i]=arr[j];
            if(i==0 || c!=arr[i-1])
                st.add(i);
            else if (i-st.peek()+1==k)
                i=st.pop()-1;
        }
        return new String(arr,0,i);
    }
}
