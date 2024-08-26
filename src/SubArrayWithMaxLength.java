import java.util.HashMap;

public class SubArrayWithMaxLength {
    public static void main(String[] args) {
        int arr[] = {15};
        System.out.println(maxLen(arr, 0));


    }

    public static int maxLen(int arr[], int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (sum == 0) {
                maxLen = i + 1;
            }

            if (map.containsKey(sum)) {

                int length = i - map.get(sum);

                maxLen = Math.max(maxLen, length);
            } else {
                map.put(sum, i);
            }
        }

        return maxLen;
    }
}
