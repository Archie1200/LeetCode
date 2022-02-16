package Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Tasks {
    public static int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q4 = new LinkedList<>();
        for(int i=0;i<pills;i++){
            q3.add(strength);
        }
        Arrays.sort(tasks);
        Arrays.sort(workers);
        for(int i=0;i<tasks.length;i++){
            q1.add(tasks[i]);
        }
        for(int i=0;i<workers.length;i++){
            q2.add(workers[i]);
        }
        for(int i=workers.length-1;i>=0;i--){
            q4.add(workers[i]);
        }
        if(q2.size()==1)
            return 1;
        int c=0;
        while(!q1.isEmpty() && !q2.isEmpty()){
            if(q1.peek()>q2.peek() && !q3.isEmpty()){
                int p=q2.peek()+q3.peek();
                if(p>=q1.peek()){
                    q1.remove();
                    q2.remove();
                    q3.remove();
                    c++;
                }
                else{
                    q2.remove();
                }
            }
            else if(q1.peek()<=q2.peek()){
                q1.remove();
                q2.remove();
                c++;
            }
            else{
                q2.remove();
            }
        }
        q1.clear();
        q3.clear();
        int d=0;
        for(int i=0;i<pills;i++){
            q3.add(strength);
        }
        Arrays.sort(tasks);
        Arrays.sort(workers);
        for(int i=0;i<tasks.length;i++){
            q1.add(tasks[i]);
        }
        for(int i=workers.length-1;i>=0;i--){
            q4.add(workers[i]);
        }
        while(!q1.isEmpty() && !q4.isEmpty()){
            if(q1.peek()>q4.peek() && !q3.isEmpty()){
                int p=q4.peek()+q3.peek();
                if(p>=q1.peek()){
                    q1.remove();
                    q4.remove();
                    q3.remove();
                    d++;
                }
                else{
                    q4.remove();
                }
            }
            else if(q1.peek()<=q4.peek()){
                q1.remove();
                q4.remove();
                d++;
            }
            else{
                q4.remove();
            }
        }
        return Math.max(c,d);
    }

    public static void main(String[] args) {
        int tasks[]={10,15,30};
        int workers[]={0,10,10,10,10};
        int pills=3;
        int strength=10;
        System.out.println(maxTaskAssign(tasks,workers,pills,strength));
    }
}
