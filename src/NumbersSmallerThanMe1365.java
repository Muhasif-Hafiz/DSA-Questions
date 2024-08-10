import java.util.Arrays;

public class NumbersSmallerThanMe1365 {
    public static void main(String[] args) {


        int [] arr={8,1,2,2,3};
        int [] ans=smallerNumbersThanCurrent(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static  int[] smallerNumbersThanCurrent(int[] nums) {


        int [] ans= new int [nums.length];
        int count=0;


        for(int i=0;i<nums.length;i++){

            for(int j=0;j<nums.length;j++){

                if(nums[i]>nums[j]){
                    count++;

                }


            }
            ans[i]=count;
            count=0;


        }
        return ans;
    }
}
