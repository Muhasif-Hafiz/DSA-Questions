public class MinimumDayBouquet1482 {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 13, 11, 12, 7};
        int k = 3;
        int m = 2;
        int ans = minDays(arr, k, m);
        if (ans == -1)
            System.out.println("We cannot make m bouquets.");
        else
            System.out.println("We can make bouquets on day " + ans);

    }
    public static int minDays(int[] bloomDay, int m, int k) {
        int ans=0;
        long value=(long)m*k;

        if(value>bloomDay.length){
            return -1;
        }

        int start=min(bloomDay);
        int end=max(bloomDay);
        while(start<=end){
            int mid=start+(end-start)/2;

            boolean possibleDay=possible(bloomDay, mid, m, k);

            if(!possibleDay){
                start=mid+1;

            }else{
                ans=mid;
                end=mid-1;
            }
        }
        return start;



    }
    public static int min(int [] arr){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
    public static int max(int [] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static boolean possible(int [] arr,int day, int m, int k){
        int count=0;
        int ans=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }else{
                ans+=(count/k);
                count=0;
            }
        }
        ans+=(count/k);

        return ans>=m;
    }
}
