public class SingleNumber136 {
    public static void main(String[] args) {
        int [] arr={4,1,2,1,2};
        int ans=singleNumber(arr);
        System.out.println(ans);

    }

    public static int singleNumber(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {

            ans = ans ^ arr[i];
        }
        return ans;


    }
}
