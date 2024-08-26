import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majorityElement {
    public static void main(String[] args) {
       int [] ans={1,1,1,3,3,2,2,2};

        System.out.println(Arrays.toString(new List[]{majorityElement(ans)}));

    }
    public static List<Integer> majorityElement(int[] nums) {

        int cnt1=0;
        int cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        List<Integer> list= new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            if(cnt1==0 && nums[i]!=el2){
                cnt1=1;
                el1=nums[i];
            }else if(cnt2==0 && nums[i]!=el1){
                cnt2=1;
                el2=nums[i];
            }
            else if(el1==nums[i]){
                cnt1++;
            }else if(el2==nums[i]){
                cnt2++;
            }else{
                cnt1--;
                cnt2--;
            }
        }
        int count1=0;
        int count2=0;

        for(int i=0;i<nums.length;i++){

            if(nums[i]==el1){
                count1++;
            }
            if(nums[i]==el2){
                count2++;
            }
        }
        if(count1>nums.length/3){
            list.add(el1);
        }
        if(count2>nums.length/3){
            list.add(el2);
        }

        return list;
    }
}
