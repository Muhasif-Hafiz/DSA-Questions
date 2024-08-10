public class HighestAltitute1732 {
    public static void main(String[] args) {
int [] arr={44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
int ans= largestAltitude(arr);
        System.out.println(ans);
    }
    public static  int largestAltitude(int[] gain) {

        int max=0;


        int [] arr=new int [gain.length+1];
        arr[0]=0;
        int sum=0;

        for(int i=1;i<arr.length;i++){

            arr[i]=gain[i-1]+sum;
            sum=arr[i];

            if(sum>max){
                max=sum;
            }


        }
        return max;

    }
}
