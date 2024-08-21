public class ReverseNumber {
    public static void main(String[] args) {
        int ans=reverse(-321);
        System.out.println(ans);


    }
    public static int reverse(int x) {
        int ans = 0;

        while (x != 0) {
            int num = x % 10;


            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && num > 7)) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && num < -8)) {
                return 0;
            }

            ans = ans * 10 + num;
            x /= 10;
        }

        return ans;
    }
}
