import java.util.Arrays;

public class SuffleTheArray1470 {
    public static void main(String[] args) {
        int [] arr={2,5,1,3,4,7};
        System.out.println(Arrays.toString(shuffle(arr,3)));
    }
    public static int [] shuffle(int[] nums, int n) {
        int a=0;
        int b=n;
        int [] ans=new int [2*n];


        for(int i=0;i<2*n;i=i+2){

            ans[i]=nums[a];
            ans[i+1]=nums[b];
            a=a+1;
            b=b+1;
        }
        return ans;

    }
}
