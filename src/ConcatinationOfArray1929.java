import java.util.Arrays;

public class ConcatinationOfArray1929 {
    public static void main(String[] args) {
        int [] arr={1,2,1};
        int [] ans=getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    public  static int[] getConcatenation(int[] nums) {
        int [] ans= new int[2* nums.length];

        for(int i=0;i<ans.length;i++){

            if(i<ans.length/2){
                ans[i]=nums[i];
            }else{

                ans[i]=nums[i-nums.length];
            }
        }
        return ans;
    }
}
