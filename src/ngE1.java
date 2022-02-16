import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] arr, int[] arr1) {
        int arr2[] = new int[arr1.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr1[arr1.length - 1]);
        arr2[arr1.length - 1] = -1;
        for (int i = arr1.length - 2; i >= 0; i--) {
            while (st.size() > 0 && st.peek() <= arr1[i])
                st.pop();
            if (st.size() == 0)
                arr2[i] = -1;
            else
                arr2[i] = st.peek();
            st.push(arr1[i]);
        }
        int arr3[]= new int[arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr1.length;j++){
                if(arr[i]==arr1[j])
                    arr3[i]=arr2[j];
            }
        }
        return arr3;
    }

    public static void main(String[] args) {
        int arr[]={4,1,2};
        int arr1[]={1,3,4,2};
    }
}