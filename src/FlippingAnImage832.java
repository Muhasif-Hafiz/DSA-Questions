import java.util.Arrays;

public class FlippingAnImage832 {
    public static void main(String[] args) {

        int [] [] arr={{1,1,0},{1,0,1},{0,0,0}};

int [][] ans=flipAndInvertImage(arr);

        for (int[] ints : arr) {

            System.out.println(Arrays.toString(ints));
        }
    }


    public static int[][] flipAndInvertImage(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                arr[i][j] ^= 1;

            }
        }


        return reverse(arr);


    }

    public static int[][] reverse(int[][] arr) {


        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length / 2; j++) {

                swap(arr[i], j, arr.length - j - 1);
            }
        }
        return arr;


    }

    public static void swap(int[] arr, int start, int end) {

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;


    }
}