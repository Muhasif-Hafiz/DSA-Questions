public class peakElementII {
    public static void main(String[] args) {

    }
    public static int[] findPeakGrid(int[][] mat) {

        int low=0;
        int high=mat[0].length-1;
        int m=mat[0].length;

        while(low<=high){

            int mid=low+(high-low)/2;

            int row= maxElement(mat, mat.length,mat[0].length, mid);

            int left= mid-1>=0?mat[row][mid-1] : -1;
            int right= mid+1<m?mat[row][mid+1] : -1;

            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int []{row, mid};
            }else if(mat[row][mid]<left){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return new int [] {-1,-1};
    }
  public static   int maxElement(int [] [] arr, int n, int m, int mid){

        int max=Integer.MIN_VALUE;
        int index=-1;

        for(int i=0;i<n;i++){

            if(arr[i][mid]>max){
                max=arr[i][mid];
                index=i;
            }
        }
        return index;
    }
}
