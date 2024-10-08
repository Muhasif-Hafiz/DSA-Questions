import java.util.*;

public class fourSum {
    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(arr, 0));


    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length; j++) {

                if (j != i+1 && nums[j] == nums[j - 1]) continue;

                int k = j + 1;
                int l = nums.length - 1;

                while (k < l) {

                    long sum = nums[i] + nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if (sum > target) {
                        l--;
                    } else if (sum < target) {
                        k++;
                    } else {

                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k], nums[l]);
                        result.add(list);
                        k++;
                        l--;

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }
                    }
                }
            }
        }
        return result;
    }
}
