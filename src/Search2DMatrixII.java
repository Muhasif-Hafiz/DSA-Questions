public class Search2DMatrixII {
    public static void main(String[] args) {
        int [] [] arr={{1,3,6,7,9},{2,5,9,11,16},{4,6,12,17,23},{7,10,15,20,24},{10,19,21,28,45}};
        boolean ans=searchMatrix(arr,17);
        System.out.println(ans);

    }
    public static boolean searchMatrix(int[][] matrix, int target) {

        int m=matrix[0].length;
        int row=0;
        int col=m-1;

        while(row<matrix.length && col>=0){

            if(matrix[row][col]==target){
                return true;
            }else if(matrix[row][col]>target){
                col--;
            }else{
                row++;
            }

        }
        return false;

    }
}
