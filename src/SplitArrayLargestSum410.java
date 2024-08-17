public class SplitArrayLargestSum410 {
    public static int splitArray(int[] nums, int k) {
        int low = nums[0];
        int high = 0;

        for(int i=0; i < nums.length; i++) {
            low = Math.max(low, nums[i]);
            high += nums[i];
        }

        while(low<=high){
            int mid=low+(high-low)/2;

            int partition=maxSum(nums,mid);

            if(partition>k){

                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return low;
    }

     static int maxSum(int [] arr, int num){

        int partition=1;
        int maximum=0;

        for(int i=0;i<arr.length;i++){

            if(maximum+arr[i]<=num){
                maximum+=arr[i];

            }else{
                partition++;
                maximum=arr[i];
            }
        }
        return partition;
    }

    public static void main(String[] args) {

        int [] arr={7,2,5,10,8};
        int k=2;
        int ans=splitArray(arr,k);
        System.out.println(ans);

    }
}
