public class peakElement {
    public static void main(String[] args) {
        int [] arr={2,1};
        int ans=findPeakElement(arr);
        System.out.println(ans);

    }
    public static int findPeakElement(int[] nums) {

        int start=0;
        int end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;

            if(nums[mid]<nums[mid+1]){
                start=mid+1;
            }else{
                end=mid;
            }
        }
        return start;

    }
}
