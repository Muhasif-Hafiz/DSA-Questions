public class MaxSum {
    public static void main(String[] args) {
        int [] arr={1,23,65,56,250,748,748,438,438,8329,932};
        int ans=0;
        for(int i=0;i< arr.length;i++){
            ans+=arr[i];
        }
        System.out.println("The Maximum sum of the Array is "+ans);
    }
}
