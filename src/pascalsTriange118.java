import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class pascalsTriange118 {

    public static void main(String[] args) {

        List<List<Integer>> list= new ArrayList<>();

        list=generate(5);

        for(int i=0;i<list.size();i++){
            System.out.println(list);
        }


    }
    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> list =  new ArrayList<>();


        for(int i=1;i<=numRows;i++){
            list.add(generateRow(i));
        }
        return list;



    }
    public static List<Integer> generateRow(int row){
        List<Integer> list =  new ArrayList<>();
        int ans=1;

        list.add(1);

        for(int col=1;col<row;col++){
            ans=ans*(row-col);
            ans=ans/col;
            list.add(ans);
        }
        return list;

    }
}
