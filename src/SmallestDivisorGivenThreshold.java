public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {

        int [] arr={44,22,33,11,1};
        int threshold=5;
        int ans=smallestDivisor(arr, threshold);
        System.out.println(ans);

    }
    public static int smallestDivisor(int[] nums, int threshold) {

        int maxi=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxi=Math.max(nums[i], maxi);
        }
        int start=1;
        int end=maxi;
        int ans=0;

        while(start<=end){
            int mid=start+(end-start)/2;

            boolean result=totalSum(nums, mid, threshold);

            if(!result){
                start=mid+1;
            }
            else{
                ans=mid;
                end=mid-1;
            }


        }
        return ans;



    }
    public static boolean totalSum(int [] arr, int num, int threshold){

        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=(int)Math.ceil((double)arr[i]/(double)num);

        }

        return sum <=threshold;
    }
}
