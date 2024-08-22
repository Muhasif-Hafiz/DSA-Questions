public class BinarySearch2D {
    public static void main(String[] args) {
        int [] [] matrix={{1,3,4,7},{10,11,13,15},{20,23,26,29}};
        int target=3;
        boolean ans=searchMatrix(matrix, target);
        System.out.println(ans);

    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix[0].length;
        int n= matrix.length;
        int low=0;
        int high=n*m-1;

        while(low<=high){

            int mid=low+high/2;

            int row= mid/ m;
            int col =mid % m;
            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return false;

    }
}
