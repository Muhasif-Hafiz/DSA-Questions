public class MatrixDiagonalSum {
    public static void main(String[] args) {

        

    }
    public  int diagonalSum(int[][] arr) {

        int sum=0;

        //For Primary Diagonal

        for (int i = 0; i <arr.length ; i++) {

            for(int j=0;j<arr.length;j++){

                if(i==j){
                    sum=sum+arr[i][j];
                }
            }

        }
        //For Secondary Diagonal

        for (int i = 0; i <arr.length ; i++) {

            for (int j = arr.length; j>0 ; j--) {

                if(i!=j){

                    sum+=arr[i][j];
                }

            }

        }



        return sum;
    }
}
