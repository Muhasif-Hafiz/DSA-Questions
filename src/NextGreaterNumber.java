import java.util.Arrays;

public class NextGreaterNumber {
    public static void main(String[] args) {
        int [] nums1={4,1,2};
        int [] nums2={1,3,4,2};

        int [] ans=nextGreaterElement(nums1, nums2);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for(int i=0;i<nums1.length;i++){
            nums1[i]=nextGreater(nums1[i],nums2);

        }
        return nums1;


    }
   public static int nextGreater(int num, int [] nums2){
       int ans = -1;
       boolean found = false;

       for (int i = 0; i < nums2.length; i++) {
           if (nums2[i] == num) {
               found = true;
           }
           if (found && nums2[i] > num) {
               ans = nums2[i];
               break;
           }
       }

       return ans;
    }
}
