import java.util.Arrays;

public class TransposeMatrix {
    public static void main(String[] args) {

        int [] [] arr={{1,2,3},{4,5,6}};

       int [] [] ans=transpose(arr);
        for (int [] ints:
             ans) {
            System.out.println(Arrays.toString(ints));
        }

    }
    public static int[][] transpose(int[][] matrix) {

        int [] [] arr=new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++){


            for(int j=0;j<matrix[i].length;j++){

                arr[j][i]=matrix[i][j];
            }
        }
        return arr;

    }
}
