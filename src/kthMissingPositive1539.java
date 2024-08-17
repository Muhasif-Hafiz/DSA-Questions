import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kthMissingPositive1539 {
    public static void main(String[] args) {

        int [] arr={5,6,7,8,9};
        int ans= findKthPositive(arr,9);
        System.out.println(ans);



    }
    public static int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int j = 0;

        // Find all missing numbers up to the last element in arr
        for (int i = 1; i <= arr[arr.length - 1]; i++) {
            if (j < arr.length && i == arr[j]) {
                j++;
            } else {
                list.add(i);
            }
        }

        // If k is larger than the number of missing numbers found,
        // return the k-th missing number beyond the last element in arr
        if (k > list.size()) {
            return arr[arr.length - 1] + (k - list.size());
        }

        return list.get(k - 1);
    }
}
