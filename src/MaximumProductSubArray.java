public class MaximumProductSubArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,-5,6,7,-8,9,10,11,-23,9,4,2,1,-3};
        System.out.println(maxProduct(arr));

    }
    public static int maxProduct(int[] nums) {

        int totalMax=0;
        int lastMax=0;
        int prod=1;

        for(int i=0;i<nums.length;i++){
            prod*=nums[i];
            lastMax=Math.max(lastMax, prod);
            if(prod<0){
                prod=1;
            }
            totalMax=Math.max(totalMax, lastMax);

        }
        return totalMax;

    }
}
