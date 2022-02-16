import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] arr1) {
        Stack<Integer> st = new Stack<>();
        st.push(arr1.length - 1);
        int arr2[]= new int[arr1.length];
        arr2[arr1.length - 1] = 0;
        for (int i = arr1.length - 2; i >= 0; i--) {
            while (st.size() > 0 && arr1[st.peek()] <= arr1[i])
                st.pop();
            if (st.size() == 0)
                arr2[i] = 0;
            else
                arr2[i] = st.peek()-i;
            st.push(i);
        }
        return arr2;
    }

    public static void main(String[] args) {
        int arr1[]={73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(dailyTemperatures(arr1)));
    }
}
