import java.util.Arrays;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
int [] nums1={0};
int []nums2={1};
merge1(nums1,nums1.length,nums2,nums2.length);


    }
    static  void merge1(int[] nums1, int m, int[] nums2, int n){
        int j=0;
        for(int i=0;i<n;i++){
            int temp=nums1[i];
            nums1[i]=nums1[nums1.length-1-i];
            nums1[nums1.length-1-i]=temp;
        }
       // System.out.println(Arrays.toString(nums1));
        for(int i=0;i<n;i++){

                nums1[i]=nums2[j];
                j++;
        }
        for(int i=0;i<nums1.length;i++){
            for(int k=1;k<nums1.length-i;k++){
                if(nums1[k]<nums1[k-1]){
                    int temp=nums1[k];
                    nums1[k]=nums1[k-1];
                    nums1[k-1]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums1));
    }

}
