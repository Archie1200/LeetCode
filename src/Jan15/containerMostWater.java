package Jan15;

public class containerMostWater {
    public int maxArea(int[] arr) {
        int a=0;
        int b=arr.length-1;
        int area=0;
        while(a<b){
            area=Math.max(area,Math.min(arr[a],arr[b])*(b-a));
            if(arr[a]<arr[b])
                a+=1;
            else
                b-=1;
        }
        return area;
    }
}
