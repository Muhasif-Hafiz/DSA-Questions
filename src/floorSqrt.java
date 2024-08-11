public class floorSqrt {
    public static void main(String[] args) {
        long ans=floorSqrt1(0);
        System.out.println(ans);
    }
    static long floorSqrt1(long n) {


        int start=0;
        int end=(int)n;

        while(start<=end){
            int mid=start+(end-start)/2;
            long square= (long) mid *mid;

            if(square>n){
                end=mid-1;
            }
            else{
                start=mid+1;
            }

        }
        return (long)end;
    }
}
