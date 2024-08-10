import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {

        int [] nums={1,2,3,4,0};
        int [] index= {0,1,2,3,0};
        int [] ans=createTargetArray(nums, index);
        System.out.println(Arrays.toString(ans));


    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        int[] ans = new int[nums.length];
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], nums[i]);
        }
        for (int i = 0; i < ans.length; i++) {

            ans[i] = list.get(i);
        }
        return ans;

    }
}
