package Medium;

public class minPartionsDeci_Binary {
    public static int minPartitions(String n) {
        char c='0';
        char arr[]=n.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>c)
                c=arr[i];
        }
        return c-'0';
    }

    public static void main(String[] args) {
        System.out.println(minPartitions("32"));
    }
}
