import java.util.Arrays;

public class ProductExceptSelf238 {
    public static void main(String[] args) {
        int [] arr={-1,1,0,-3,3};
        int [] ans=productExceptSelf(arr);
        System.out.println(Arrays.toString(ans));

    }
    public static int[] productExceptSelf(int[] nums) {

        int [] prefix=new int [nums.length];
        int pre=1;
        int [] suffix=new int [nums.length];
        int suf=1;

        for(int i=0;i<prefix.length;i++){
            pre*=nums[i];
            prefix[i]=pre;
        }
        for(int i=suffix.length-1;i>=0;i--){
            suf*=nums[i];
            suffix[i]=suf;
        }

        for(int i=0;i<nums.length;i++){

            if (i<nums.length-1 && i>=1) {
                nums[i]= prefix[i - 1]* suffix[i+1];
            }else if(i<1){
                nums[i]=suffix[i+1];
            }else if(i>=nums.length-1){
                nums[i]=prefix[i-1];
            }






        }
        return nums;

    }
}
