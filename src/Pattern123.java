public class Pattern123 {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        System.out.println(find132pattern(arr));
    }
    public  static boolean find132pattern(int[] nums) {
        int i=0;

        if(i<nums.length-2){
            for(i=0;i<nums.length;){
                if(i<nums.length-2){
                    if(nums[i]<nums[i+2] && nums[i+2]<nums[i+1]){
                        return true;
                    }
                    else{
                        i++;
                    }
                }else{
                    return false;
                }
            }
        }

        return false;
    }
}
