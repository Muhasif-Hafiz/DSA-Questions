import java.util.Arrays;
public class missing_Number {
    public static void main(String[] args) {
int [] arr={0,1,4,3,2};

        int ans=missingNumber(arr);
        System.out.println(ans);
      //  System.out.println(Arrays.toString(arr));

    }
    static int missingNumber(int [] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]!=i){
                if(nums[i]==nums.length){
               i++;
                }else {
                    swap(nums, i, nums[i] );
                }
            }else {
                i++;
            }
        }
        for(int l=0;l<nums.length;l++){
            if(nums[l]!=l){
                return l;
            }
        }
        return nums.length;
    }
static void swap(int [] arr, int start, int end) {
    int temp = arr[start];
    arr[start] = arr[end];
    arr[end] = temp;
}
}
