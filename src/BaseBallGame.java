import java.util.ArrayList;
import java.util.Objects;
import java.util.Stack;

public class BaseBallGame {
    public static int calPoints(String[] ops) {
         Stack<Integer> st = new Stack<>();
        ArrayList<Integer> arr = new ArrayList<>();
         int val=0;
         for(int i=0;i<ops.length;i++){
             if(Objects.equals(ops[i], "C"))
                 st.pop();
             else if(st.size()>0 && Objects.equals(ops[i], "D")) {
                 val = Integer.parseInt(String.valueOf(st.peek()));
                 st.push(2*val);
             }
             else if(Objects.equals(ops[i], "+")){
                 int v1=st.pop();
                 int v2=st.pop();
                 st.push(v2);
                 st.push(v1);
                 st.push(v1+v2);
             }
             else
                 st.push(Integer.parseInt(ops[i]));
         }
         while(st.size()>0){
             arr.add(st.pop());
         }
         int sum=0;
         for(int i=0;i<arr.size();i++){
             sum+=arr.get(i);
         }
         return sum;
    }

    public static void main(String[] args) {
        String arr[]={"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(arr));
    }
}
