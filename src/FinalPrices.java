import java.util.Scanner;
import java.util.Stack;

public class FinalPrices {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[]={8,4,6,2,3};
        int arr2[]= new int[arr.length];
        Stack<Integer> st= new Stack<>();
        st.push(arr[arr.length-1]);
        arr2[arr.length-1]=0;
        for(int i=arr.length-2;i>=0;i--){
            while(st.size()>0 && st.peek()>arr[i])
                st.pop();
            if(st.size()==0)
                arr2[i]=0;
            else
                arr2[i]=st.peek();
            st.push(arr[i]);
        }
        int arr3[]= new int[arr.length];
        for(int i=0;i<arr2.length;i++){
           arr3[i]=arr[i]-arr2[i];
        }
    }
}
