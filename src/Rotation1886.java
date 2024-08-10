import java.util.Arrays;

public class Rotation1886 {
    public static void main(String[] args) {
        int[][] mat = {{0, 1}, {1, 0}};
        int[][] target = {{1, 0}, {0, 1}};
        boolean ans = findRotation(mat, target);
        System.out.println(ans);
//        int [][] ans=rotate(mat);
//        for(int []aw : ans){
//            System.out.println(Arrays.toString(aw));
//        }


    }

    public static boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < mat.length - 1; i++) {

            int[][] first = rotate(mat);
            if (isSame(first, target)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSame(int[][] ans, int[][] target) {


        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[i].length; j++) {

                if (ans[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[][] rotate(int[][] mat) {
        int[][] ans = new int[mat.length][mat.length];

        for (int i = 0; i < mat.length; i++) {

            for (int j = 0; j < mat[i].length; j++) {
                ans[i][j] = mat[mat.length - 1 - j][i];
            }
        }
        return ans;

    }

}
