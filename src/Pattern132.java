import java.util.Queue;
import java.util.Stack;

public class Pattern132 {
    public static boolean find132pattern(int[] nums) {
       Stack<Integer> st1= new Stack<>();
       Stack<Integer> st2 = new Stack<>();
       for(int i=0;i<nums.length;i++){
           st1.push(nums[i]);
       }
       int c=0;
       st2.push(st1.pop());
       while (st1.size()>0 ){
           int p=st1.pop();
           if(st1.size()>0 && p>st1.peek() && p>st2.peek() && st2.peek()>st1.peek()) {
               c = 1;
               break;
           }
           else {
               st2.push(p);
               c = 0;
           }
       }
       if(c==0)
           return false;
       else
           return true;
    }

    public static void main(String[] args) {
        int arr[]={3,1,4,2};
        System.out.println(find132pattern(arr));
    }
}
