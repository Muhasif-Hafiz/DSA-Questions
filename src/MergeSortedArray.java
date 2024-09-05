import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {
    public static void main(String[] args) {
int [] nums1={1,2,3,0,0,0};
int [] nums2={2,5,6};
      merge(nums1, 3, nums2, nums2.length);
        System.out.println(Arrays.toString(nums1));

    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while (i >= 0 && j >= 0) {

            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }


        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}