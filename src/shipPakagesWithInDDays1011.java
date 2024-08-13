public class shipPakagesWithInDDays1011 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,10,11,12};
        int days=5;
        int ans=shipWithinDays(arr, days);
        System.out.println(ans);

    }
    public static int shipWithinDays(int[] weights, int days) {
        int start=Integer.MIN_VALUE;
        int sum=0;
        for(int num : weights){
            start=Math.max(num, start);
            sum+=num;
        }
        int end=sum;
        int ans=0;
        while(start<=end){
            int mid=start+(end-start)/2;

            int Totaldays=minimumDays(weights, mid);

            if(Totaldays> days){
                start=mid+1;
            }else{
                ans=mid;
                end=mid-1;
            }


        }
        return ans;


    }
    public static int minimumDays(int [] arr, int capacity){

        int load=0;
        int days=1;

        for(int i=0;i<arr.length;i++){
            if(load+arr[i]>capacity){
                days++;
                load=arr[i];
            }else{
                load+=arr[i];
            }
        }
        return days;
    }
}
