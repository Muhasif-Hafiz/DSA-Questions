public class MediamMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {8, 9, 11, 12, 13},
                {21, 23, 25, 27, 29}
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = median(matrix, m, n);
        System.out.println("The median element is: " + ans);


    }
    static  int median(int matrix[][], int R, int C) {


        int low = Integer.MAX_VALUE, high = Integer.MIN_VALUE;


        for (int i = 0; i < R; i++) {
            low = Math.min(low, matrix[i][0]);
            high = Math.max(high, matrix[i][C - 1]);
        }

        int req=(R*C)/2;


        while(low<=high){

            int mid=low+(high-low)/2;

            int smallerEquals=blackBox(matrix,mid);

            if(smallerEquals<=req){
                low=mid+1;
            }else{
                high=mid-1;
            }

        }
        return low;
    }


    static  int blackBox(int [] [] arr, int mid){

        int count=0;
        for(int i=0;i<arr.length;i++){

            count+=upperBound(arr[i],mid,arr[0].length);
        }
        return count;

    }
   static int upperBound(int [] arr, int num, int m){


        int low=0;
        int high=m-1;
        int ans=m;


        while(low<=high){

            int mid=low+(high-low)/2;

            if(arr[mid]<=num){
                low=mid+1;
            }else{
                ans=mid;
                high=mid-1;
            }
        }
        return ans;
    }
}
