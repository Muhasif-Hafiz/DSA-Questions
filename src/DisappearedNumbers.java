import java.util.*;
public class DisappearedNumbers {
    public static void main(String[] args) {
int [] arr={4,3,2,7,8,2,3,1};
        System.out.println(sort(arr));
//sort(arr);
//        System.out.println(Arrays.toString(arr));

    }
//    static  List<Integer> findDisappearedNumbers(int[] nums) {
//
//    }
    static List<Integer> sort(int [] nums){
        int i=0;
        int N=nums.length;
        while(i<N){
            int correct=nums[i]-1;
            if (nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        List<Integer> list=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                list.add(j+1);
            }
        }
        return list;
    }
    static void swap(int [] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

}
