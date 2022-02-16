import java.util.Stack;

public class propleQueue {
    public int[] canSeePersonsCount(int[] heights) {
        int n=heights.length;
        Stack<Integer> st = new Stack<>();
int arr[]= new int[n];
    for(int i=0;i<n;i++){
        while(st.size()>0 && heights[st.peek()]<=heights[i])
            ++arr[st.pop()];
        if(st.size()>0)
            ++arr[st.peek()];
        st.push(i);
    }
    return arr;
    }

}
