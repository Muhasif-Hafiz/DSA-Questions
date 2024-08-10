public class single_Element {
    public static void main(String[] args) {
        int [] arr={3,3,7,7,10,11,11};
        int ans=singleNonDuplicate(arr);
        System.out.println(ans);

    }
    public  static int singleNonDuplicate(int[] nums) {
        int ans=-1;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if((start+mid+1)%2==0){
                start=mid+1;
            }else if((start+mid+1)%2!=0){
                end=mid-1;
            }
            else{
                return nums[mid];
            }
            ans=nums[mid];
        }

        return ans;
    }
}
