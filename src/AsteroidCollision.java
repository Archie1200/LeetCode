import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class AsteroidCollision {
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        ArrayList<Integer> arr2= new ArrayList<>();
        for (int i = 0; i < asteroids.length; i++) {
            st.push(asteroids[i]);
        }
        int max = 0;
        int t1 = st.pop();
        int t2 = st.pop();
        if (Math.abs(t1) != Math.abs(t2)) {
            if (t1 < 0) {
                if (Math.abs(t1) > t2)
                    max = t1;
                else
                    max = t2;
            } else if (t2 < 0) {
                if (Math.abs(t2) > t1)
                    max = t2;
                else
                    max = t1;
            }
            if (t1 < 0 || t2 < 0) {
                st1.push(max);
            } else if ((t1 > 0 && t2 > 0) || (t1 < 0 && t2 < 0)) {
                st1.add(t1);
                st1.add(t2);
            }
        }
        while (st.size() > 0) {
            if (st1.isEmpty()) {
                maximum(max, st1, st);
            } else {
                int p = st.pop();
                int q = st1.pop();
                if (p < 0) {
                    if (Math.abs(p) > q)
                        max = p;
                    else
                        max = q;
                } else if (q < 0) {
                    if (Math.abs(q) > p)
                        max = q;
                    else
                        max = p;
                }
                if (p < 0 || q < 0) {
                    st1.push(max);
                }
                else if ((p > 0 && q > 0) || (p < 0 && q < 0)) {
                    st1.add(p);
                    st1.add(q);
                }

            }
        }

        while (st1.size() > 0) {
            arr2.add(st1.pop());
        }
        int arr[]= new int[arr2.size()];
        Collections.reverse(arr2);
        for(int i=0;i<arr2.size();i++){
            arr[i]=arr2.get(i);
        }
        return arr;
    }

    public static void maximum(int max, Stack<Integer> st1, Stack<Integer> st) {

        //int max=0;
        int t1 = st.pop();
        int t2 = st.pop();
        if (Math.abs(t1) != Math.abs(t2)) {
            if (t1 < 0) {
                if (Math.abs(t1) > t2)
                    max = t1;
                else
                    max = t2;
            } else if (t2 < 0) {
                if (Math.abs(t2) > t1)
                    max = t2;
                else
                    max = t1;
            }
            if (t1 < 0 || t2 < 0) {
                st1.push(max);
            } else if ((t1 > 0 && t2 > 0) || (t1 < 0 && t2 < 0)) {
                st1.add(t1);
                st1.add(t2);
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={5,10,-5};
        System.out.println(asteroidCollision(arr));
    }
}
