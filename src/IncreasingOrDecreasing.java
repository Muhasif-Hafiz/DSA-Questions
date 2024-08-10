public class IncreasingOrDecreasing {
    public static void main(String[] args) {


        int [] arr={1,4,3,3,2};
        int ans=longestMonotonicSubarray(arr);
        System.out.println(ans);
    }
    public static int longestMonotonicSubarray(int[] nums) {

        int increasingCount=1;
        int decreasingCount=1;

        int n=nums.length-1;





        for(int i=0;i<n;i++){

            if(isStrictlyIncreasing(nums)){
                if(nums[i]<nums[i+1]){
                    increasingCount+=1;

                }else if(nums[i]==nums[i+1]){


                }else{
                    break;
                }

            }else{
                if(nums[i]>nums[i+1]){
                    decreasingCount+=1;
                }else if(nums[i]==nums[i+1]){

                }else{
                    break;
                }

            }



        }
        return Math.max(increasingCount,decreasingCount);
    }
    public static boolean isStrictlyIncreasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
