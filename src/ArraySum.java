import java.util.ArrayList;
import java.util.List;

public class ArraySum {
    public static void main(String[] args) {
        int [] nums={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k=1;

        List<Integer> ans=addToArrayForm(nums,k);
        System.out.println(ans);

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        long  ans=0;
        List<Integer> list=new ArrayList<>();

        for(int i=0;i<num.length;i++){
            ans= (long) (ans+num[i]*Math.pow(10,num.length-1-i));

        }
        ans=ans+k;

        while (ans > 0) {
            int save = (int) (ans % 10);
            list.add(0, save);
            ans /= 10;
        }
        return list;

    }



}
