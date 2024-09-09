import java.util.ArrayList;

public class ReversePairs493 {
    public static void main(String[] args) {
        System.out.println(reversePairs(new int [] {1,3,2,3,7,80,364,62,84,31}));
    }
    public static int reversePairs(int[] nums) {

        int count=0;
        count=mergeSort(nums, 0, nums.length-1);
        return count;




    }

    static int mergeSort(int [] arr, int low, int high){
        int count=0;

        if(low>=high){
            return count;
        }
        int mid=(low+high)/2;

        count+=mergeSort(arr, low, mid);
        count+=mergeSort(arr, mid+1, high);
        count+=countPairs(arr, low, mid, high);
        merge(arr, low, mid, high);

        return count;

    }
    static  void merge(int [] arr, int low, int mid, int high){
        ArrayList<Integer> list= new ArrayList<>();

        int left= low;
        int right=mid+1;


        while(left<=mid && right<=high){

            if(arr[left]<=arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }


        }
        while(left<= mid){
            list.add(arr[left]);
            left++;
        }
        while(right<= high){
            list.add(arr[right]);
            right++;
        }
        for (int i = low; i <= high; i++) {
            arr[i] = list.get(i - low);
        }


    }

    public static int countPairs(int[] arr, int low, int mid, int high) {
        int count = 0;
        int right = mid + 1;

        for (int i = low; i <= mid; i++) {
            while (right <= high && (long) arr[i] > 2 * (long) arr[right]) {
                right++;
            }
            count += (right - (mid + 1));
        }
        return count;
    }
}
