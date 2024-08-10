import java.util.Arrays;

public class Starting_ending_position34 {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,6,6,6,6,6,6,45};
        int target=6;
        int [] ans=searchRange(arr, target);
        System.out.println(Arrays.toString(ans));

    }

    public static int binarySearch(int [] arr,  int target, boolean find){
        int ans=-1;
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid= start+(end-start)/2;


            if(arr[mid]<target){
                start=mid+1;
            }else if (arr[mid]> target){
                end=mid-1;

            }else {
                ans=mid;
                if(find==true){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
    public static int[] searchRange(int[] arr, int target) {

        int [] ans={-1,-1};
       ans[0]=binarySearch(arr, target, true);
       ans[1]=binarySearch(arr, target,false);

       return ans; 

    }

}
