import java.util.Arrays;

public class LargestNegative2441 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 6, 7, -7};
        int ans = findMaxK(arr);
        System.out.println(ans);
    }


    public static int findMaxK(int[] arr) {
        Arrays.sort(arr);
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            if(max<arr[i]){
                max=arr[i];
            }

            for (int j = arr.length-1; j >= 0; j--) {
                if (arr[i] == (-1 * arr[j]) ) {
                    return arr[i];
                } else {
                    j--;
                }
            }

        }
        return -1;

    }
}