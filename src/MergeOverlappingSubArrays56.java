import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeOverlappingSubArrays56 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        int [][]ans =merge(arr);
        System.out.print("The merged intervals are: \n");

        for(int i=0;i<ans.length;i++){
            for (int j=0;j<ans[0].length;j++){
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static int[][] merge(int[][] arr) {


        int n= arr.length;
        Arrays.sort(arr,new Comparator<int []>(){

            public int compare(int [] a, int [] b){
                return a[0]-b[0];
            }
        });
        List<List<Integer>> list= new ArrayList<>();

        for(int i=0;i<n;i++){

            if (list.isEmpty() || arr[i][0] > list.get(list.size() - 1).get(1)) {
                list.add(Arrays.asList(arr[i][0], arr[i][1]));
            }else{

                list.get(list.size() - 1).set(1, Math.max(list.get(list.size() - 1).get(1), arr[i][1]));
            }

        }
        int[][] ans = new int[list.size()][2];

        for(int i=0;i<list.size();i++){
            for(int j=0;j<list.get(0).size();j++){

                ans[i][j]=list.get(i).get(j);
            }
        }
        return ans;
    }
}
