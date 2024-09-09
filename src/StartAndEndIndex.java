import java.util.Arrays;

public class StartAndEndIndex {
    public static void main(String[] args) {

        int ans []= new int [2];
        int [] nums={5,7,7,8,8,10};
        ans[0]=searchRange(nums, 8, false);
        ans[1]=searchRange(nums, 8, true);
        System.out.println(Arrays.toString(ans));



    }
    public static int searchRange(int[] nums, int target, boolean find) {
        int low=0;
        int high=nums.length-1;
        int ans=-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(nums[mid]>target){
                high=mid-1;
            }else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                ans=mid;
                if(find){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
return ans;
    }
}
