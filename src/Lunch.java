import java.util.*;

public class Lunch {
    public static int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < students.length; i++)
            q.add(students[i]);
        ArrayList<Integer> arr = new ArrayList<>();
        for (int j = 0; j < sandwiches.length; j++) {
            arr.add(sandwiches[j]);
        }
        Collections.reverse(arr);
        for (int j = 0; j < sandwiches.length; j++) {
            st.push(sandwiches[j]);
        }
        int c = 0,v=Integer.MIN_VALUE;
        while (c!=q.size() && q.size() != 0 && st.size()!=0  ) {
            if (Objects.equals(q.peek(), st.peek())) {
                c=0;
                q.remove();
                st.pop();
            } else if (st.size()!=0 && q.size()!=0 && !Objects.equals(q.peek(), st.peek())){
                c++;
                int p=q.remove();
                q.add(p);
            }
            System.out.println(q.size());
        }
        return c;
    }

    public static void main(String[] args) {
        int arr1[]={0,0,0,1,0,1,1,1,1,0,1};
        int arr2[]={0,0,0,1,0,0,0,0,0,1,0};
        int p=countStudents(arr1,arr2);
        System.out.println(p);
    }
}
